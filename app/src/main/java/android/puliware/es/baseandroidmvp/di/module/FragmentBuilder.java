package android.puliware.es.baseandroidmvp.di.module;

import android.puliware.es.baseandroidmvp.view.ItemFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * We create a FragmentBuilder module and add as module to MainActivityComponent.
*/

@Module
public abstract class FragmentBuilder {

    @ContributesAndroidInjector(modules = ItemFragmentModule.class)
    abstract ItemFragment bindItemFragment();

   /* @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);*/


}
