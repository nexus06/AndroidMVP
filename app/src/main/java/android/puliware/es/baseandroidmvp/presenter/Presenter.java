package android.puliware.es.baseandroidmvp.presenter;

/**
 * Created by luipullop on 23/01/18.
 */

import android.puliware.es.baseandroidmvp.view.base.MvpView;

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}