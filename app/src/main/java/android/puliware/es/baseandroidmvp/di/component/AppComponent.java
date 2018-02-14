package android.puliware.es.baseandroidmvp.di.component;

import android.app.Application;
import android.puliware.es.baseandroidmvp.di.module.ActivityBuilder;
import android.puliware.es.baseandroidmvp.di.module.AppModule;
import android.puliware.es.baseandroidmvp.view.BoilerplateApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

/**
 * Created by luipullop on 26/01/18.
 * Root of our dagger graph
 * Android apps have one application class. That is why we have one application component.
 * This component is responsible for providing application scope instances (eg. OkHttp, Database, SharedPrefs.).
 * This Component is root of our dagger graph. Application component is providing 3 module in our app.
 - AndroidSupportInjectionModule : We didn’t create this. It is an internal class in Dagger 2.10. Provides our
 activities and fragments with given module.
 - ActivityBuilder : We created this module. This is a given module to dagger.
 We map all our activities here. And Dagger know our activities in compile time.
 In our app we have Main and Detail activity. So we map both activities here.
 - AppModule: We provide retrofit, okhttp, persistence db, shared pref etc here.
 There is an important detail here.
 We have to add our subcomponents to AppModule. So our dagger graph will understand that.

 The AppComponent is annotated with @Component and @Singleton to indicate that its modules
 (AppModule) are to provide @Singleton scoped or unscoped dependencies.
 */



@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(BoilerplateApp app);

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}