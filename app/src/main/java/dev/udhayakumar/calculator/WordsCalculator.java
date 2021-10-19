package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.StringTokenizer;

public class WordsCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_calculator);
        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final EditText input  = (EditText) findViewById(R.id.words);
        final TextView result = (TextView) findViewById(R.id.result);
        final TextView result2 = (TextView) findViewById(R.id.result2);
        Button calculation = (Button) findViewById(R.id.submit);
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibe.vibrate(50);
                String  str = input.getText().toString();
                if(str.length()==0){
                    Snackbar.make(view, "Enter Something ", Snackbar.LENGTH_SHORT).show();
                }else{
                    StringTokenizer words = new StringTokenizer(str);
                    String letters = str.replaceAll("\\s","");
                    result.setText(" Total no of words = "+String.valueOf(words.countTokens()));
                    result2.setText(" Total no of letters = "+String.valueOf(letters.length()));
                }
            }
        });

    }
}