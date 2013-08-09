package com.threeh.trainticket;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import com.threeh.trainticket.interfaces.ActivityInterface;

public class HomeActivity extends Activity implements ActivityInterface {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home);
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
