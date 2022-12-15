package dev.udhayakumar.calculator;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class clacApplication extends Application {
    @Override
    public void onCreate() {
        DynamicColors.applyToActivitiesIfAvailable(this);
        super.onCreate();
    }
}
