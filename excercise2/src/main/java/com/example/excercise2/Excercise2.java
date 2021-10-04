package com.example.excercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Excercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercise2);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ageText = (EditText) findViewById(R.id.Age);
                int age = Integer.parseInt(ageText.getText().toString());
                if (age%5 == 3){
                    Toast.makeText(Excercise2.this, "You will get married", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Excercise2.this, "Probably not :v", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}