package com.threeh.trainticket;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import com.threeh.trainticket.interfaces.ActivityInterface;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-12
 * Time: 上午10:21
 * To change this template use File | Settings | File Templates.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
