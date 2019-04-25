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

        final Intent intent = getIntent();
        textView.setText(intent.getStringExtra("extra_data"));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("data_return","Hello MainActivity");
                setResult(2,intent);
                finish();
            }
        });
    }
}
