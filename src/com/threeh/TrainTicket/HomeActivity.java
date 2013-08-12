package com.threeh.trainticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.threeh.trainticket.interfaces.ActivityInterface;


public class HomeActivity extends BaseActivity implements ActivityInterface {
    private ImageView mImgviewQueryTrain,mImgviewQueryHighspeedTrain,mImgviewAttention,mImgviewOrder;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }

    @Override
    public void initdata() {

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
    }
}
