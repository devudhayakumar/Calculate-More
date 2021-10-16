package dev.udhayakumar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class WordsCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_calculator);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final EditText input  = (EditText) findViewById(R.id.words);
        final TextView result = (TextView) findViewById(R.id.result);
        final TextView result2 = (TextView) findViewById(R.id.result2);
        Button calculation = (Button) findViewById(R.id.submit);
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  str = input.getText().toString();
                if(str.length()==0){
                    Log.i("total","0");
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