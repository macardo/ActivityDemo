package com.macardo.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.buton1);
        Button button2 = findViewById(R.id.button2);
        final Intent intent = getIntent();
        textView.setText(intent.getStringExtra("extra_data"));

        System.out.println("Main2Activity task id: " + getTaskId());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("data_return","Hello MainActivity");
                setResult(2,intent);
                finish();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
