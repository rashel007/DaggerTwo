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


@Module public class AppModule {

    private final MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    @Provides @Singleton Context provideApplicationContext() { return application; }

    @Provides @Singleton SharedPreferences provideApplicationSharedPreferences(Context app) {
        return app.getSharedPreferences("My_Prefs", Context.MODE_PRIVATE);
    }




}
