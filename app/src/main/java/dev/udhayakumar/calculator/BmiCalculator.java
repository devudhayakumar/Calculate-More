package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;

public class BmiCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        EditText weight = (EditText) findViewById(R.id.weight);
        EditText height = (EditText) findViewById(R.id.height);
        TextView answer = (TextView) findViewById(R.id.bmianswer);
        Button calculate = (Button) findViewById(R.id.bmicalculatebtn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sweight = weight.getText().toString();
                String sheight = height.getText().toString();
                if(sweight.length() == 0  || sheight.length() ==0 ){
                    Snackbar.make(view, "Enter both inputs", Snackbar.LENGTH_SHORT).show();
                }else {
                    double val1 = Double.parseDouble(sweight);
                    double val2 = Double.parseDouble(sheight);
                    double result = (val1/val2/val2)*10000;
                    String status = "none";
                    if(result<=18.4){
                        status = "Underweight";
                    }else if (result<=24.9){
                        status = "Normal";
                    }else if (result<=39.9){
                        status = "Overweight";
                    }else {
                        status = "Obese";
                    }
                    answer.setText("BMI : "+String.format("%.2f",result)+"    |   "+" Status : "+status);
                }

            }
        });

    }
}