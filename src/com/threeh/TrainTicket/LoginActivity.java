package com.threeh.trainticket;

import android.app.Activity;
import android.content.Intent;
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
public class LoginActivity extends BaseActivity implements ActivityInterface{
    private Button mBtnBack,mBtnLogin;
    private TextView mTxtTitle;
    private String mStrUsername,mStrPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {
        mBtnBack = (Button) this.findViewById(R.id.titlebar_btn_back);
        mBtnLogin = (Button) this.findViewById(R.id.login_btn_login);
        mTxtTitle = (TextView) this.findViewById(R.id.titlebar_txt_title);
    }

    @Override
    public void initdata() {

    }

    @Override
    public void addAction() {
        mTxtTitle.setText("登录");
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,OrderCenterActivity.class);
                intent.putExtra("username",mStrUsername);
                intent.putExtra("username",mStrPassword);
                startActivity(intent);
            }
        });
    }
}
