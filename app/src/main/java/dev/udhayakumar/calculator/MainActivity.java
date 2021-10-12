package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button agecal = (Button)findViewById(R.id.buttonswitch2);
        Button cgpacal = (Button)findViewById(R.id.buttonswitch1);
        cgpacal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, CgpaCalculator.class);
                startActivity(i);
            }
        });
        agecal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, AgeCalculator.class);
                startActivity(i);
            }
        });

    }

}