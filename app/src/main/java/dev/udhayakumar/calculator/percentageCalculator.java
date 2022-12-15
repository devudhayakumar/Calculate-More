package dev.udhayakumar.calculator;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class percentageCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage_calculator);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final EditText value1 = (EditText) findViewById(R.id.price);
        final EditText  value2 = (EditText) findViewById(R.id.value2);
        final EditText  value3 = (EditText) findViewById(R.id.value3);
        final TextView result1 = (TextView) findViewById(R.id.result1);
        final TextView type1result = (TextView) findViewById(R.id.type1result);
        final TextView type2result = (TextView) findViewById(R.id.type2result);
        Button type1 = (Button) findViewById(R.id.type1button) ;
        Button type2 = (Button) findViewById(R.id.type2button) ;
        Button submit1 = (Button) findViewById(R.id.submit1);
        submit1.setOnClickListener(view -> {
            vibe.vibrate(50);
            String val1 = value1.getText().toString();
            String val2 = value2.getText().toString();
            String val3 = value3.getText().toString();

            if (val1.length()==0 && val2.length()==0 && val3.length()==0){
                Snackbar.make(view, "Need to enter atleast two value ", Snackbar.LENGTH_SHORT).show();

            }else if((val1.length()==0 && val2.length()==0) || (val2.length()==0 && val3.length()==0) || (val1.length()==0 && val3.length()==0)){
                Snackbar.make(view, "Need to enter atleast two value ", Snackbar.LENGTH_SHORT).show();

            }else if (val1.length()>0 && val2.length()>0 && val3.length()>0){
                Snackbar.make(view, "Enter only two value ", Snackbar.LENGTH_SHORT).show();

            }else {
                //int intval1=Integer.parseInt(val1);
                if(val1.length()==0){
                    double dubval2=Double.parseDouble(val2);
                    double dubval3=Double.parseDouble(val3);
                    double cal = dubval3/dubval2 *100;
                    Log.i("result" ,String.valueOf(cal));
                    result1.setText("Answer : "+String.format("%.2f" , cal) +"%");
                }else if(val2.length()==0){
                    double dubval1=Double.parseDouble(val1);
                    double dubval3=Double.parseDouble(val3);
                    double cal = dubval3/dubval1 *100;
                    result1.setText("Answer : "+String.format("%.2f" , cal));
                }else if(val3.length()==0){
                    double dubval1=Double.parseDouble(val1);
                    double dubval2=Double.parseDouble(val2);
                    double cal = (dubval1/100)*dubval2;
                    result1.setText("Answer : "+String.format("%.2f" , cal));

                }
            }

        });
        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(50);
                final EditText type1value1 = (EditText) findViewById(R.id.type1value1);
                final EditText type1value2 = (EditText) findViewById(R.id.type1value2);
                if(type1value1.length()==0 || type1value2.length()==0){
                    Snackbar.make(view, "Enter Both inputs ", Snackbar.LENGTH_SHORT).show();
                }else{
                    double val1 = Double.parseDouble(type1value1.getText().toString());
                    double val2 = Double.parseDouble(type1value2.getText().toString());
                    double result = (val1/100)*val2;
                    type1result.setText("Answer :  " + String.format("%.2f" , result) );
                }
            }
        });
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(50);
                final EditText type2value1 = (EditText) findViewById(R.id.type2value1);
                final EditText type2value2 = (EditText) findViewById(R.id.type2value2);
                if(type2value1.length()==0 || type2value2.length()==0){
                    Snackbar.make(view, "Enter Both inputs ", Snackbar.LENGTH_SHORT).show();
                }else{
                    double val1 = Double.parseDouble(type2value1.getText().toString());
                    double val2 = Double.parseDouble(type2value2.getText().toString());
                    double result = (val1/val2)*100;
                    type2result.setText("Answer :  " + String.format("%.2f" , result)+"%" );
                }
            }
        });

    }
}