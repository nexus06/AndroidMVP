package android.puliware.es.baseandroidmvp.di.module;

import android.puliware.es.baseandroidmvp.presenter.ItemFragmentPresenter;
import android.puliware.es.baseandroidmvp.view.ItemFragment;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;


/**
 * About Binds
 * This annotation provides a replacement
 * of @Provides methods which simply return the injected parameter. Let’s take an example,
 * https://proandroiddev.com/dagger-2-annotations-binds-contributesandroidinjector-a09e6a57758f
 */

@Module
public abstract class ItemFragmentModule {


    @Provides
    static ItemFragmentPresenter provideItemFragmentPresenter() {
        return new ItemFragmentPresenter();
    }

    @Binds
    abstract IViews.ItemFragmentRequiredViewOps provideRequiredOps(ItemFragment itemFragment);
}
