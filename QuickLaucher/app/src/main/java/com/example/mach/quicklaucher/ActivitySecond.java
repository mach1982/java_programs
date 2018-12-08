package com.example.mach.quicklaucher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.mach.quicklaucher.SOMETHING")){

            TextView tv =(TextView) findViewById(R.id.textView);
            String text =  getIntent().getExtras().getString("com.example.mach.quicklaucher.SOMETHING");
            tv.setText(text);
        }

    }
}
