package com.nwj.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            }
        });

        Button button1 = findViewById(R.id.btn2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
                overridePendingTransition(R.anim.slide_edit_in, R.anim.slide_edit_out);
            }
        });

        Button button2 = findViewById(R.id.btn3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                overridePendingTransition(R.anim.slide_from_in_up, R.anim.slide_to_up);
            }
        });

        Button button3 = findViewById(R.id.btn4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this, MainActivity.class));
                overridePendingTransition(R.anim.slide_edit_from_in, R.anim.slide_edit_to_out);
            }
        });
    }
}
