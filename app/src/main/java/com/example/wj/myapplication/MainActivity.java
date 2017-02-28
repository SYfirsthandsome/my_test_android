package com.example.wj.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //testkjnlkjjkl
    }
    
    private void test(){


        Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
        
    }
}
