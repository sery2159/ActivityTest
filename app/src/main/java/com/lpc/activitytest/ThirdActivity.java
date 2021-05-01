package com.lpc.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 功能:
 * <p>
 * 描述:
 * <p>
 * Created by lipc0113 on 2018/7/16.
 */
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void click(View view) {

        Intent i = new Intent(this, FourActivity.class);

//        这个标记，将会导致任何用来放置该activity的已经存在的task里面的已经存在的activity先清空
//         ，然后该activity再在该task中启动，也就是说，**这个新启动的activity变为了这个空task的根activity
//         .所有老的activity都结束掉。该标志必须和FLAG_ACTIVITY_NEW_TASK一起使用。
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

//        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(i);
    }
}
