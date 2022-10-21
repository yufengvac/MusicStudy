package com.tencent.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_1);
        Button button = findViewById(R.id.button_1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 点击逻辑
                textView.setText("已购买");
            }
        });
    }
}