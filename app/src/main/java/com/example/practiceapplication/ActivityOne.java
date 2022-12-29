package com.example.practiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity {

    private Button btn;
    private EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        btn = findViewById(R.id.send_to);
        txt = findViewById(R.id.edit_txt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txt.getText().toString();
                Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
                intent.putExtra("data",str);
                startActivity(intent);
            }
        });
    }
}