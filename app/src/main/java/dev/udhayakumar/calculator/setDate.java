package dev.udhayakumar.calculator;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class setDate implements View.OnFocusChangeListener, DatePickerDialog.OnDateSetListener {
    public EditText editText;
    public Calendar myCalendar;
    private Context ctx;

    public setDate(EditText editText, Context ctx){
        this.editText = editText;
        this.editText.setOnFocusChangeListener(this);
        this.ctx = ctx;
        myCalendar = Calendar.getInstance();
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        if(b){
            new DatePickerDialog(ctx, this, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                    myCalendar.get(Calendar.DAY_OF_MONTH)).show();
        }
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String myFormat = "MMM dd, yyyy"; //In which you need put here
        SimpleDateFormat sdformat = new SimpleDateFormat(myFormat, Locale.US);
        myCalendar.set(Calendar.YEAR, i2);
        myCalendar.set(Calendar.MONTH, i1);
        myCalendar.set(Calendar.DAY_OF_MONTH, i);
        editText.setText(sdformat.format(myCalendar.getTime()));
    }
}
