package com.ikabi.activityto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    隐式跳转：通过指定action和data
     */

public void click1(View v){
    Intent intent = new Intent();
    /* 隐式意图*/
    intent.setAction(Intent.ACTION_CALL);
    intent.setData(Uri.parse("tel:110"));
    /* 跳转打电话 */
    startActivity(intent);

}
    /*
    * 显示跳转：直接指定目标Activity的包名和类名
    */
    public void click2(View v){
        Intent intent = new Intent();
        /* 显示意图 */
        intent.setClass(this, Second.class);
    startActivity(intent);
    }
    public void click3(View v){
        Intent intent = new Intent();
        //指定目标Activity的包名和类名
        intent.setClassName("com.android.mms", "com.android.mms.ui.ConversationList");
        startActivity(intent);
    }
    public void click4(View v){
        Intent intent = new Intent();
        //指定目标Activity的包名和类名
        intent.setAction(Intent.ACTION_DIAL);
        startActivity(intent);
    }
    public void click5(View v){
        Intent intent = new Intent();
        intent.setAction("com.ikabi.se");
        startActivity(intent);
    }
}
