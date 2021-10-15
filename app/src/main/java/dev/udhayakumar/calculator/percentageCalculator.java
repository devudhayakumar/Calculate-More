package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class percentageCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage_calculator);
        final EditText value1 = (EditText) findViewById(R.id.price);
        final EditText  value2 = (EditText) findViewById(R.id.value2);
        final EditText  value3 = (EditText) findViewById(R.id.value3);
        final TextView result1 = (TextView) findViewById(R.id.result1);
        Button submit1 = (Button) findViewById(R.id.submit1);
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1 = value1.getText().toString();
                String val2 = value2.getText().toString();
                String val3 = value3.getText().toString();

                if (val1.length()==0 && val2.length()==0 && val3.length()==0){
                    result1.setText("Need to enter atleast two value⚠");
                }else if((val1.length()==0 && val2.length()==0) || (val2.length()==0 && val3.length()==0) || (val1.length()==0 && val3.length()==0)){
                    result1.setText("Need to enter atleast two value⚠");

                }else if (val1.length()>0 && val2.length()>0 && val3.length()>0){
                    result1.setText("Enter only two value⚠");

                }else {
                    //int intval1=Integer.parseInt(val1);
                    if(val1.length()==0){
                        double dubval2=Double.parseDouble(val2);
                        double dubval3=Double.parseDouble(val3);
                        double cal = dubval3/dubval2 *100;
                        Log.i("result" ,String.valueOf(cal));
                        result1.setText("Result:"+cal);
                    }else if(val2.length()==0){
                        double dubval1=Double.parseDouble(val1);
                        double dubval3=Double.parseDouble(val3);
                        double cal = dubval3/dubval1 *100;
                        result1.setText("Result:"+cal);
                    }else if(val3.length()==0){
                        double dubval1=Double.parseDouble(val1);
                        double dubval2=Double.parseDouble(val2);
                        double cal = (dubval1/100)*dubval2;
                        result1.setText("Result:"+cal);

                    }
                }

            }
        });

    }
}