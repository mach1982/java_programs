package com.example.mach.quicklaucher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button secondActivityBtn =(Button) findViewById(R.id.secondActivityBtn);

        secondActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent starttIntent= new Intent(getApplicationContext(),ActivitySecond.class);
                starttIntent.putExtra("com.example.mach.quicklaucher.SOMETHING","HELO WORD!");
                startActivity(starttIntent);

            }
        });


        Button googleBtn = (Button) findViewById(R.id.googleBtn);

        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url ="http://www.rte.ie";
                Uri rte =Uri.parse(url);

                Intent gotoRte =new Intent(Intent.ACTION_VIEW,rte);
                if (gotoRte.resolveActivity(getPackageManager())!=null) {
                    startActivity(gotoRte);

                }

            }
        });




    }
}
