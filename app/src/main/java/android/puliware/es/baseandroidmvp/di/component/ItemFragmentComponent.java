package android.puliware.es.baseandroidmvp.di.component;

import android.puliware.es.baseandroidmvp.di.module.ItemFragmentModule;
import android.puliware.es.baseandroidmvp.view.ItemFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by luipullop on 26/01/18.
 * This component is just a bridge to ItemFragmentModule.
 * But here is an important change here. We don’t add inject() and build() method to this component.
 * ItemFragmentComponent has these methods from ancestor class.
 * AndroidInjector class is new dagger-android class which exist in dagger-android framework.
 */


@Subcomponent(modules = ItemFragmentModule.class)
public interface ItemFragmentComponent extends AndroidInjector<ItemFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ItemFragment> {
    }
}
