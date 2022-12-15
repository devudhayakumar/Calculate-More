package dev.udhayakumar.calculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardper = (CardView) findViewById(R.id.cardpercentage);
        CardView cardage = (CardView) findViewById(R.id.cardage);
        CardView cardcgpa = (CardView) findViewById(R.id.cardcgpa);
        CardView cardgst = (CardView) findViewById(R.id.cardgst);
        CardView cardwords = (CardView) findViewById(R.id.cardwords);
        CardView carddate = (CardView) findViewById(R.id.carddate);
        CardView cardbmi = (CardView) findViewById(R.id.cardbmi);
        CardView carddiscount = (CardView) findViewById(R.id.carddiscount);
        carddiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, DiscountCalculator.class);
                startActivity(i);
            }
        });
        cardbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, BmiCalculator.class);
                startActivity(i);
            }
        });
        carddate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this, DateCalculator.class);
                startActivity(i);
            }
        });
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
        cardwords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( MainActivity.this,WordsCalculator.class);
                startActivity(i);
            }
        });

    }

}