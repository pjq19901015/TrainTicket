package com.threeh.trainticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.threeh.trainticket.interfaces.ActivityInterface;


public class HomeActivity extends FragmentActivity implements ActivityInterface {
    private ImageView mImgviewQueryTrain,mImgviewQueryHighspeedTrain,mImgviewAttention,mImgviewOrder;
    private HomeViewpageAdapter mAdapter;
    private ViewPager mPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home);
        findView();
        initdata();
        addAction();
    }

    @Override
    public void findView() {
        mImgviewQueryTrain = (ImageView) this.findViewById(R.id.home_imgview_query_train);
        mImgviewQueryHighspeedTrain =
                (ImageView) this.findViewById(R.id.home_imgview_query_highspeed_train);
        mImgviewAttention = (ImageView) this.findViewById(R.id.home_imgview_attention);
        mImgviewOrder = (ImageView) this.findViewById(R.id.home_imgview_order);
        mPager = (ViewPager) this.findViewById(R.id.home_viewpage);
    }

    @Override
    public void initdata() {
        mAdapter = new HomeViewpageAdapter(getSupportFragmentManager());
    }

    @Override
    public void addAction() {
        mImgviewQueryTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,QueryTrainActivity.class);
                startActivity(intent);
            }
        });
        mImgviewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        mPager.setAdapter(mAdapter);
    }
}
