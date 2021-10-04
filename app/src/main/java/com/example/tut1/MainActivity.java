package com.example.tut1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            int clicks = 0;
            @Override
            public void onClick(View v) {
                clicks++;
                Toast.makeText(MainActivity.this, Integer.toString(clicks), Toast.LENGTH_SHORT).show();
            }
        });
    }
}