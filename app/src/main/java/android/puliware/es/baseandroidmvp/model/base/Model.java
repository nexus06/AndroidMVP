package android.puliware.es.baseandroidmvp.model.base;

/**
 * Created by luipullop on 23/01/18.
 */

import android.puliware.es.baseandroidmvp.presenter.base.MvpPresenter;

/**
 * Every model in the app must either implement this interface or extend BaseModel
 * indicating the Presenter type that wants to be attached with.
 */
public interface Model<V extends MvpPresenter> {

    void attachPresenter(V presenter);

    void detachPresenter();
}