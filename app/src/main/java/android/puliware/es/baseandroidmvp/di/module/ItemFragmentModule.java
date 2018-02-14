package android.puliware.es.baseandroidmvp.di.module;

import android.app.Activity;
import android.app.Fragment;
import android.puliware.es.baseandroidmvp.di.PerActivity;
import android.puliware.es.baseandroidmvp.di.PerFragment;
import android.puliware.es.baseandroidmvp.presenter.ItemFragmentPresenter;
import android.puliware.es.baseandroidmvp.utils.PerActivityUtil;
import android.puliware.es.baseandroidmvp.utils.PerFragmentUtil;
import android.puliware.es.baseandroidmvp.utils.SingletonUtil;
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

    @Binds
    @PerFragment
    abstract Fragment fragment(ItemFragment itemFragment);


    @Binds
    @PerFragment
    abstract IViews.ItemFragmentRequiredViewOps provideRequiredOps(ItemFragment itemFragment);

    @Provides
    @PerFragment
    static ItemFragmentPresenter provideItemFragmentPresenter(IViews.ItemFragmentRequiredViewOps view, SingletonUtil singletonUtil,
                                                              PerActivityUtil activityUtil, PerFragmentUtil fragmentUtil) {
        return new ItemFragmentPresenter(view, singletonUtil, activityUtil, fragmentUtil);
    }
}
