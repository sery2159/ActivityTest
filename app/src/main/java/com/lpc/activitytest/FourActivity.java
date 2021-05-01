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
public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
    }

    public void click(View view) {

        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
