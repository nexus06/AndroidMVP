package android.puliware.es.baseandroidmvp.di.module;

import android.content.SharedPreferences;
import android.puliware.es.baseandroidmvp.model.MainModel;
import android.puliware.es.baseandroidmvp.presenter.MainPresenter;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;
import android.puliware.es.baseandroidmvp.view.MainActivity;
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
abstract class MainActivityModule {

    @Provides
    static MainPresenter provideMainPresenter(IViews.MainActivityRequiredViewOps view, SharedPreferences sharedPreferences) {
        return new MainPresenter(view, sharedPreferences);
    }

    @Provides
    static MainModel provideMainModel(IPresenters.MainRequiredPresenterOps presenterOps) {
        return new MainModel(presenterOps);
    }

    @Binds
    abstract IViews.MainActivityRequiredViewOps provideRequiredViewOps(MainActivity mainActivity);

    @Binds
    abstract IPresenters.MainRequiredPresenterOps provideRequiredPresenterOps(MainPresenter mainPresenter);
}
