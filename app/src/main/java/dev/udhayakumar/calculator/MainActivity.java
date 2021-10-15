package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardper = (CardView) findViewById(R.id.cardpercentage);
        CardView cardage = (CardView) findViewById(R.id.cardage);
        CardView cardcgpa = (CardView) findViewById(R.id.cardcgpa);
        CardView cardgst = (CardView) findViewById(R.id.cardgst);
        cardper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, percentageCalculator.class);
                startActivity(i);
            }
        });
        cardcgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, CgpaCalculator.class);
                startActivity(i);
            }
        });
        cardage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, AgeCalculator.class);
                startActivity(i);
            }
        });
        cardgst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,GstCalculator.class);
                startActivity(i);
            }
        });

    }

}