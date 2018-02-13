package android.puliware.es.baseandroidmvp.di.module;

import android.puliware.es.baseandroidmvp.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by luipullop on 26/01/18.
 * We created this module. This is a given module to dagger. We map all our activities here.
 * And Dagger know our activities in compile time. In our app we have Main activity. So we map here.
 */

@Module
public abstract class ActivityBuilder {

   /* @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);*/

    @ContributesAndroidInjector(modules ={ MainActivityModule.class, FragmentBuilder.class })
    abstract MainActivity bindMainActivity();

}
