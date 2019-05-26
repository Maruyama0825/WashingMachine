package com.example.washingmachine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity  extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button MyInformation= (Button)findViewById(R.id.button3);
        MyInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        MyInformation.class);
                startActivity(intent);
            }
        });

        Button NoticeWhole= (Button)findViewById(R.id.button4);
        NoticeWhole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                       LookNoticeWhole.class);
                startActivity(intent);
            }
        });





    }

}
