package com.example.estique.daggertwo;

import android.app.Application;

import com.example.estique.daggertwo.dagger.DaggerComponent;
import com.example.estique.daggertwo.dagger.DaggerDaggerComponent;

/**
 * Created by estique on 12/15/17.
 */

public class MyApplication extends Application {

    DaggerComponent daggerComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        daggerComponent = DaggerDaggerComponent.builder().build();

    }

    public DaggerComponent getDaggerComponent() {
        return daggerComponent;
    }
}
