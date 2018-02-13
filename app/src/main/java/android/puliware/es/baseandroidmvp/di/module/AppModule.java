package android.puliware.es.baseandroidmvp.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by luipullop on 26/01/18.
 * AppModule: We provide retrofit, okhttp, persistence db, shared pref etc here.
 * There is an important detail here.
 */

@Module
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);

    @Provides
    static SharedPreferences preferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
