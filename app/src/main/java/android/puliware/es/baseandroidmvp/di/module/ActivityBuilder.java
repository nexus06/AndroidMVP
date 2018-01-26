package android.puliware.es.baseandroidmvp.di.module;

import android.app.Activity;
import android.puliware.es.baseandroidmvp.di.component.MainActivityComponent;
import android.puliware.es.baseandroidmvp.view.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by luipullop on 26/01/18.
 * We created this module. This is a given module to dagger. We map all our activities here.
 * And Dagger know our activities in compile time. In our app we have Main activity. So we map here.
 *
 */

@Module(subcomponents = MainActivityComponent.class)
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

   /* @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);*/


}
