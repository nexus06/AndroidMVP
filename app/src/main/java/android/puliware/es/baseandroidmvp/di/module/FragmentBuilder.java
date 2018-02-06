package android.puliware.es.baseandroidmvp.di.module;

import android.app.Fragment;
import android.puliware.es.baseandroidmvp.di.component.ItemFragmentComponent;
import android.puliware.es.baseandroidmvp.view.ItemFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * We create a FragmentBuilder module and add as module to MainActivityComponent.
 * Now we can create ItemFragmentComponent and ItemFragmentModule just like we did in MainActivityComponent and MainActivityModule.
 */

@Module(subcomponents = ItemFragmentComponent.class)
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(ItemFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindItemFragment(ItemFragmentComponent.Builder builder);

   /* @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);*/


}
