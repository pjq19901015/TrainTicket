package com.threeh.trainticket;

import android.app.ExpandableListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import com.threeh.trainticket.adapter.TrainExpandListAdapter;
import com.threeh.trainticket.adapter.TrainListAdapter;
import com.threeh.trainticket.entity.Trains;
import com.threeh.trainticket.interfaces.ActivityInterface;
import com.threeh.trainticket.widget.XListView;
import com.trainOrderService.trainOrderService;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-12
 * Time: 下午5:37
 * To change this template use File | Settings | File Templates.
 */
public class TrainListActivity extends BaseActivity
        implements ActivityInterface,ExpandableListView.OnGroupClickListener {
    private String mStrStartCity, mStrEndCity, mStrDate;
    private TextView mTxtTitle;
    private ExpandableListView mListView;
    private TrainExpandListAdapter mAdapter;
    private Trains mTrains;
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    mListView.setAdapter(mAdapter);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.train_list);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView(){
        mTxtTitle = (TextView) this.findViewById(R.id.titlebar_txt_title);
        mListView = (ExpandableListView) findViewById(R.id.train_list_lvi);
    }

    @Override
    public void initdata() {
        mStrStartCity = getIntent().getStringExtra("startCity");
        mStrEndCity = getIntent().getStringExtra("endCity");
        mStrDate = getIntent().getStringExtra("date");
        LoadDataTask task = new LoadDataTask();
        task.execute();
    }

    @Override
    public void addAction() {
        mTxtTitle.setText(mStrStartCity + "-" + mStrEndCity);
        mListView.setOnGroupClickListener(this);
    }

    @Override
    public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
        boolean isChecked = mTrains.getTrainCodeAndPriceList().get(groupPosition).isChecked();
        mTrains.getTrainCodeAndPriceList().get(groupPosition).setChecked(!isChecked);
        mAdapter.notifyDataSetChanged();
        return false;
    }

    /**
     * 用于加载查询的火车的列表的异步任务栈。
     * 获得数据后发送消息到消息队列。
     */
    class LoadDataTask extends AsyncTask<Void, Integer, Integer> {

        @Override
        protected Integer doInBackground(Void... params) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //List<DGTicketPrice> data = new ArrayList<DGTicketPrice>();
                        /*data.add(new DGTicketPrice("G101", "高铁"));
                        data.add(new DGTicketPrice("G101", "高铁"));
                        data.add(new DGTicketPrice("G101", "高铁"));*/
                        trainOrderService service = new trainOrderService();
                        mTrains = service.getAllTrainCodeAndPrice("上海","南京","2013-08-16");
                        //mAdapter = new TrainListAdapter(TrainListActivity.this, mTrains.getTrainCodeAndPriceList());
                        if(mTrains != null){
                            mAdapter = new TrainExpandListAdapter(TrainListActivity.this,mTrains.getTrainCodeAndPriceList());
                            Message message = mHandler.obtainMessage();
                            message.what = 1;
                            mHandler.sendMessage(message);
                        }

                    } catch (Exception e){
                    }
                }
            }).start();
            return null;
        }
    }
}