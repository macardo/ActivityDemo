package com.macardo.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button SecondBtn = findViewById(R.id.SecondActivityBtn);
        SecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ActivityB task id: "+getTaskId());
                Intent intent = new Intent(ActivityB.this,ActivityC.class);
                startActivity(intent);
            }
        });
    }
}
