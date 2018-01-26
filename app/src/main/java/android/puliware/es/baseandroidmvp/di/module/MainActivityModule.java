package android.puliware.es.baseandroidmvp.di.module;

import android.puliware.es.baseandroidmvp.presenter.MainPresenter;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import dagger.Module;
import dagger.Provides;

/**
 * Created by luipullop on 26/01/18.
 * This module provides main activity related instances
 * (eg. MainActivityPresenter).
 * Did you see provideMainView() method takes MainActivity as parameter? Yes.
 * We create our MainActivityComponent with our <MainActivity> class.
 * So dagger will attach our activity to it’s graph. So we can use it because it is on the graph.
 */

@Module
public class MainActivityModule {



    @Provides
    MainPresenter provideMainPresenter(){
        return new MainPresenter();
    }

    @Provides
    void initPresenter(IViews.MainActivityRequiredViewOps view){
        new MainPresenter().onCreate(view);
    }
}
