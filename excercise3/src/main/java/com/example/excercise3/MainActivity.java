package com.example.excercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getBMI = (Button) findViewById(R.id.button);
        getBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText heightText = (EditText) findViewById(R.id.Height);
                int height = Integer.parseInt(heightText.getText().toString());
                EditText weightText = (EditText) findViewById(R.id.Weight);
                int weight = Integer.parseInt(weightText.getText().toString());
                Toast.makeText(MainActivity.this, Integer.toString(weight/(height*height)), Toast.LENGTH_SHORT).show();
            }
        });

        Button convertUnit = (Button) findViewById(R.id.button3);
        convertUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText heightText = (EditText) findViewById(R.id.Height);
                int height = Integer.parseInt(heightText.getText().toString());
                EditText weightText = (EditText) findViewById(R.id.Weight);
                int weight = Integer.parseInt(weightText.getText().toString());

                heightText.setText(Double.toString(height/2.5));
                weightText.setText(Double.toString(weight*2.2));

                TextView heightView = (TextView) findViewById(R.id.HeightText);
                heightView.setText("Height (inches)");
                TextView weightView = (TextView) findViewById(R.id.WeightText);
                weightView.setText("Weight (pb)");
            }
        });
    }
}