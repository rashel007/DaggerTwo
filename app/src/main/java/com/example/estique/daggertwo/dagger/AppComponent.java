package com.example.estique.daggertwo.dagger;

import com.example.estique.daggertwo.BaseActivity;
import com.example.estique.daggertwo.MyApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by estique on 12/15/17.
 */

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MyApplication application);

    void inject(BaseActivity baseActivity);

}
