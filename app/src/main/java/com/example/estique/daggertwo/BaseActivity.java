package com.example.estique.daggertwo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by estique on 12/15/17.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject public SharedPreferences preferences;
    @Inject public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MyApplication) getApplication() ).getAppComponent().inject(this);
    }
}
