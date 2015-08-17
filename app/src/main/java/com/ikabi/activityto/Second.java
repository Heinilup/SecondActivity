package com.ikabi.activityto;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2015-08-17 0017.
 */
public class Second extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        //获取到启动这个activity的意图
        Intent intent = getIntent();
        Uri uri = intent.getData();
        System.out.println(uri.toString());
    }
    public void backto1(View v){
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
    }
}
