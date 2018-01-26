package android.puliware.es.baseandroidmvp.view;

import android.puliware.es.baseandroidmvp.di.component.AppComponent;
import android.puliware.es.baseandroidmvp.di.component.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created by luipullop on 26/01/18.
 */


public class BoilerplateApp extends DaggerApplication {


    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
