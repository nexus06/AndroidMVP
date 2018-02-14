package android.puliware.es.baseandroidmvp.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

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
    @Singleton
    /*
     * Singleton annotation isn't necessary since Application instance is unique but is here for
     * convention. In general, providing Activity, Fragment, BroadcastReceiver, etc does not require
     * them to be scoped since they are the components being injected and their instance is unique.
     *
     * However, having a scope annotation makes the module easier to read. We wouldn't have to look
     * at what is being provided in order to understand its scope.
     */
    abstract Context provideContext(Application application);

    @Provides
    @Singleton
    static SharedPreferences preferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
