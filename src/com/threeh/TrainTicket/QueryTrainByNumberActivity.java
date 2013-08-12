package com.threeh.trainticket;

import android.app.Activity;
import android.os.Bundle;
import com.threeh.trainticket.interfaces.ActivityInterface;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-12
 * Time: 上午10:14
 * To change this template use File | Settings | File Templates.
 */
public class QueryTrainByNumberActivity extends BaseActivity implements ActivityInterface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_search);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {

    }

    @Override
    public void initdata() {

    }

    @Override
    public void addAction() {
    }
}
