package com.threeh.trainticket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.threeh.trainticket.interfaces.ActivityInterface;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-16
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */
public class OrderCenterActivity extends BaseActivity implements ActivityInterface{
    private Button mBtnBack,mBtnPassengerInformation;
    private TextView mTxtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_center);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {
        mBtnBack = (Button) this.findViewById(R.id.titlebar_btn_back);
        mBtnPassengerInformation = (Button) this.findViewById(R.id.titlebar_btn_right);
        mTxtTitle = (TextView) this.findViewById(R.id.titlebar_txt_title);
    }

    @Override
    public void initdata() {
    }

    @Override
    public void addAction() {
        mTxtTitle.setText("订单中心");
        mBtnPassengerInformation.setVisibility(View.VISIBLE);
        mBtnPassengerInformation.setBackgroundResource(R.drawable.passenger_information_btn_selector);
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
