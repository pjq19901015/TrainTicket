package com.threeh.trainticket;

import android.app.ExpandableListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.*;
import com.threeh.trainticket.adapter.TrainExpandListAdapter;
import com.threeh.trainticket.adapter.TrainListAdapter;
import com.threeh.trainticket.entity.Trains;
import com.threeh.trainticket.interfaces.ActivityInterface;
import com.threeh.trainticket.widget.XListView;
import com.trainOrderService.trainOrderService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    private TextView mTxtTitle,mTxtDate;
    private ExpandableListView mListView;
    private TrainExpandListAdapter mAdapter;
    private Trains mTrains;
    private Button mBtnBack,mBtnNextday,mBtnPreviousday;
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
        mTxtDate = (TextView) this.findViewById(R.id.chosedate_bar_txt_date);
        mListView = (ExpandableListView) findViewById(R.id.train_list_lvi);
        mBtnBack = (Button) this.findViewById(R.id.titlebar_btn_back);
        mBtnNextday = (Button) this.findViewById(R.id.chosedate_bar_btn_next);
        mBtnPreviousday = (Button) this.findViewById(R.id.chosedate_bar_btn_prev);
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
        mTxtDate.setText(mStrDate);
        mListView.setOnGroupClickListener(this);
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mBtnNextday.setOnClickListener(new DateClickListener(1));
        mBtnPreviousday.setOnClickListener(new DateClickListener(-1));
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
                        trainOrderService service = new trainOrderService();
                        mTrains = service.getAllTrainCodeAndPrice(mStrStartCity,mStrEndCity,mStrDate);
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

    /**
     * 前一天/后一天
     * @param strDate 当前时间的字符串
     * @param number 1表示增加一天，-1代表减少一天
     * @return
     */
    private String changeDay(String strDate,int number){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(strDate);
            calendar.setTime(date);
            calendar.add(Calendar.DATE, number);
            date = calendar.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return simpleDateFormat.format(date);
    }

    class DateClickListener implements View.OnClickListener{
        private int number;

        DateClickListener(int number) {
            this.number = number;
        }
        @Override
        public void onClick(View v) {
            mStrDate = changeDay(mStrDate,number);
            mTxtDate.setText(mStrDate);
        }
    }
}