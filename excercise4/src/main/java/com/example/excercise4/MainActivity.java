package com.example.excercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<View> allButtons =  findViewById(R.id.parent).getTouchables();
        for (View button: allButtons) {
            if (button instanceof Button){
                button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.this.onClick(((Button) button).getText().toString());
                }
            });
            }
        }
    }

    public void onClick(String inputButton) {
        TextView display = (TextView) findViewById(R.id.display);
        display.setText(inputButton);
    }
}