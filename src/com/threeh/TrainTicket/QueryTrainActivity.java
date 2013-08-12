package com.threeh.trainticket;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TabHost;
import com.threeh.trainticket.interfaces.ActivityInterface;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-12
 * Time: 上午8:47
 * To change this template use File | Settings | File Templates.
 */
public class QueryTrainActivity extends TabActivity implements ActivityInterface{
    private TabHost mTabhost;
    private RadioGroup mRadiogroup;
    private static final String STATION_TAB = "station";
    private static final String NUMBER_TAB = "number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.query_train);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {
        mRadiogroup = (RadioGroup) this.findViewById(R.id.query_train_radiogroup);
    }

    @Override
    public void initdata() {
       initTabhost();
    }

    @Override
    public void addAction() {
        mRadiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.query_train_rdobtn_station:
                        mTabhost.setCurrentTabByTag(STATION_TAB);
                        break;
                    case R.id.query_train_rdobtn_number:
                        mTabhost.setCurrentTabByTag(NUMBER_TAB);
                        break;
                }
            }
        });
    }

    /**
     * 初始化tabhost中的tab
     */
    private void initTabhost(){
        mTabhost = this.getTabHost();
        mTabhost.addTab(mTabhost.newTabSpec(STATION_TAB).setIndicator(STATION_TAB)
                .setContent(new Intent(this, QueryTrainByStationActivity.class)));
        mTabhost.addTab(mTabhost.newTabSpec(NUMBER_TAB).setIndicator(NUMBER_TAB)
                .setContent(new Intent(this, QueryTrainByNumberActivity.class)));
    }
}
