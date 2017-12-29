package com.example.peleg.exbutton1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private int cnt1=0;
    private int cnt2=0;
    private int cnt3=0;
    private int cnt4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new HandleClick1());
        findViewById(R.id.button2).setOnClickListener(handleClick2);
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) {
                cnt3++;
                TextView tv3 =  findViewById(R.id.tv3);
                tv3.setText(Integer.toString(cnt3));
            }
        });
        findViewById(R.id.button4).setOnClickListener(this);
    }
        public void onClick(View arg0) {
            cnt4++;
            TextView tv4 =  findViewById(R.id.tv4);
            tv4.setText(Integer.toString(cnt4));
        }

    private class HandleClick1 implements View.OnClickListener {

        public HandleClick1() {

        }

        public void onClick(View arg0) {
            cnt1++;
            TextView tv1 =  findViewById(R.id.tv1);
            tv1.setText(Integer.toString(cnt1));
        }

    };
    private View.OnClickListener handleClick2 = new View.OnClickListener(){
        public void onClick(View arg0) {
            cnt2++;
            TextView tv2 = findViewById(R.id.tv2);
            tv2.setText(Integer.toString(cnt2));
        }
    };



}
