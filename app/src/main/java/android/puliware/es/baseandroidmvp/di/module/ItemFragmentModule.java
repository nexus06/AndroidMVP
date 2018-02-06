package android.puliware.es.baseandroidmvp.di.module;

import android.puliware.es.baseandroidmvp.presenter.ItemFragmentPresenter;
import android.puliware.es.baseandroidmvp.view.ItemFragment;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import dagger.Module;
import dagger.Provides;

/**
 * Let say we have a fragments in our MainActivity. What will we do in that case?
 * Actually it is not hard to guess. Lets think our Activity and Application relationship.
 * Application knows Activities with a mapping module(ActivityBuilder in my sample).
 * And we add our activities to AppModule as subcomponent.
 * Same relationship between Activity and its Fragments.
 */

@Module
public class ItemFragmentModule {

    @Provides
    IViews.ItemFragmentRequiredViewOps provideRequiredOps(ItemFragment itemFragment) {
        return itemFragment;
    }

    @Provides
    ItemFragmentPresenter provideItemFragmentPresenter() {
        return new ItemFragmentPresenter();
    }
}
