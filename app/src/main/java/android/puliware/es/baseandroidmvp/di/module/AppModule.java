package android.puliware.es.baseandroidmvp.di.module;

import android.app.Application;
import android.content.Context;
import android.puliware.es.baseandroidmvp.di.component.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luipullop on 26/01/18.
 * AppModule: We provide retrofit, okhttp, persistence db, shared pref etc here.
 * There is an important detail here.
 * We have to add our subcomponents to AppModule. So our dagger graph will undestand that.
 */

@Module(subcomponents = {
        MainActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}
