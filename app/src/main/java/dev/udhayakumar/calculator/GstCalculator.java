package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class GstCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst_calculator);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        final EditText price = (EditText) findViewById(R.id.price);
        RadioGroup taxper = (RadioGroup) findViewById(R.id.taxper);
        Button calculate = (Button) findViewById(R.id.submit);
        final TextView total = (TextView) findViewById(R.id.total);
        final TextView csgst = (TextView) findViewById(R.id.csgst);

        int selectedId = taxper.getCheckedRadioButtonId();
        final String[] tax = new String[1];
        tax[0] = "";
        taxper.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) findViewById(i);
                tax[0] = String.valueOf(radioButton.getTag());
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(50);
                String value = price.getText().toString();
                if(value.length()==0){
                    Snackbar.make(view, "Enter any price ", Snackbar.LENGTH_SHORT).show();
                }else if (tax[0].length()==0){
                    Snackbar.make(view, "Select any tax percentage", Snackbar.LENGTH_SHORT).show();
                }else {
                    Integer.parseInt(tax[0]);
                    String taxpercentage =  tax[0];
                    double result = ((Double.parseDouble(taxpercentage)/100)*Double.parseDouble(value)+Double.parseDouble(value));
                    csgst.setText("SGST  : "+(result/2)+"        CGST  : "+ (result/2) );
                    total.setText("Total price : "+result);

                }
            }
        });


    }
}