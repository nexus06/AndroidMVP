package android.puliware.es.baseandroidmvp.di.component;

import android.puliware.es.baseandroidmvp.di.module.FragmentBuilder;
import android.puliware.es.baseandroidmvp.di.module.ItemFragmentModule;
import android.puliware.es.baseandroidmvp.di.module.MainActivityModule;
import android.puliware.es.baseandroidmvp.view.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by luipullop on 26/01/18.
 * This component is just a bridge to MainActivityModule.
 * But here is an important change here. We don’t add inject() and build() method to this component.
 * MainActivityComponent has these methods from ancestor class.
 * AndroidInjector class is new dagger-android class which exist in dagger-android framework.
 */


@Subcomponent(modules = {MainActivityModule.class, FragmentBuilder.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
