package com.threeh.trainticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.threeh.trainticket.interfaces.ActivityInterface;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-12
 * Time: 上午10:14
 * To change this template use File | Settings | File Templates.
 */
public class QueryTrainByStationActivity extends BaseActivity implements ActivityInterface{
    private Button mBtnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_search);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {
        mBtnSearch = (Button) this.findViewById(R.id.search_half_bottom_btn_search);
    }

    @Override
    public void initdata() {

    }

    @Override
    public void addAction() {
        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  =
                        new Intent(QueryTrainByStationActivity.this,TrainListActivity.class);
                intent.putExtra("startCity","上海");
                intent.putExtra("endCity","苏州");
                intent.putExtra("date","2013-08-20");
                startActivity(intent);
            }
        });
    }
}
