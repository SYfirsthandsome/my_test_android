package com.example.wj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void showTips(View view){

        Toast.makeText(this, "这是一个代码提示,加上我的修改,优点神奇", Toast.LENGTH_SHORT).show();



        
       

    }
    public void showError(View view) throws  Exception{

        Toast.makeText(this, "在这里抛出一个异常", Toast.LENGTH_SHORT).show();
        throw new JSONException("json 解析出错了");

    }





}
