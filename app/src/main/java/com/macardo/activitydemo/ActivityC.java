package com.macardo.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button ThirdBtn = findViewById(R.id.ThirdActivityBtn);
        ThirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ActivityC task id: "+getTaskId());
                Intent intent = new Intent(ActivityC.this,ActivityB.class);
                startActivity(intent);
            }
        });
    }
}
