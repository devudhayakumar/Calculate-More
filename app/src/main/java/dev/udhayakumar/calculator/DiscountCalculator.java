package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class DiscountCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_calculator);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final EditText percentage = (EditText) findViewById(R.id.percentage);
        final EditText price = (EditText) findViewById(R.id.price);
        final TextView discountprice = (TextView) findViewById(R.id.result);
        final TextView finalprice = (TextView) findViewById(R.id.result2);
        final TextView save =(TextView) findViewById(R.id.save);
        Button calculation = (Button) findViewById(R.id.calculate);
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(50);
                String value1 = percentage.getText().toString();
                String value2 = price.getText().toString();
                if(value1.length()==0 || value2.length()==0){
                    Snackbar.make(view, "Enter both inputs", Snackbar.LENGTH_SHORT).show();
                }else{
                    double val1 = Double.parseDouble(value1);
                    double val2 = Double.parseDouble(value2);


                    double result1 =  val2 * (val1/100) ;
                    double result2 =  val2 - result1;

                    discountprice.setText("Rs " +String.format("%.2f",result1) );
                    finalprice.setText("Rs " +String.format("%.2f",result2));
                    save.setText("You Save Rs " + String.format("%.0f",result1) );
                }
            }
        });
    }
}