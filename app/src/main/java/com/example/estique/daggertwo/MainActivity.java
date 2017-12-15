package com.example.estique.daggertwo;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends BaseActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Before setting" +  preferences.getInt("Number", 0));

        preferences.edit().putInt("Number", 6).apply();

        Log.d(TAG, "After setting" +  preferences.getInt("Number", 0));
    }
}
