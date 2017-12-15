package com.example.estique.daggertwo;

import android.app.Application;

import com.example.estique.daggertwo.dagger.AppComponent;
import com.example.estique.daggertwo.dagger.AppModule;
import com.example.estique.daggertwo.dagger.DaggerAppComponent;

/**
 * Created by estique on 12/15/17.
 */

public class MyApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        appComponent.inject(this);

    }

    public AppComponent getAppComponent() {
        return this.appComponent;
    }
}
