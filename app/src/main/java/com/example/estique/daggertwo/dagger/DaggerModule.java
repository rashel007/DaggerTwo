package com.example.estique.daggertwo.dagger;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.estique.daggertwo.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by estique on 12/15/17.
 */


@Module
public class DaggerModule {

    private final MyApplication application;

    public DaggerModule(MyApplication application) {
        this.application = application;
    }

    @Provides @Singleton
    Context provideApplicationContext() { return application; }

    @Provides @Singleton
    SharedPreferences provideApplicationSharedPreferences(Context app) {
        return app.getSharedPreferences("My_Preds", Context.MODE_PRIVATE);
    }




}
