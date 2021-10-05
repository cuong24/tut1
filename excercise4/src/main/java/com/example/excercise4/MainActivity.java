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
    int result = 0;
    int currentNumber = 0;
    String currentOperation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display2 = (TextView) findViewById(R.id.display2);
        display2.setText(Integer.toString(result));

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
        if(Utils.isNumberic(inputButton)){
            handleNumber(Integer.parseInt(inputButton));
        } else {
            handleOperation(inputButton);
        }

        TextView display = (TextView) findViewById(R.id.display);
        display.setText(Integer.toString(currentNumber));
        TextView display2 = (TextView) findViewById(R.id.display2);
        display2.setText(Integer.toString(result)+currentOperation);

    }

    private void handleOperation(String operation) {

        switch (currentOperation) {
            case "":
                currentOperation = operation;
                result = currentNumber;
                break;
            case "x":
                result = result * currentNumber;
                break;
            case "/":
                result = result / currentNumber;
                break;
            case "+":
                result = result + currentNumber;
                break;
            case "-":
                result = result - currentNumber;
                break;
        }
        currentNumber = 0;
        currentOperation = operation;
        if(operation.contains("clear")){
            result = 0;
            currentOperation = "";
        }
        if(operation.contains("=")){
            currentOperation = "";
        }
    }

    private void handleNumber(int number){
        if(currentNumber == 0){
            currentNumber = number;
        } else {
            currentNumber = currentNumber*10 + number;
        }

    }
}