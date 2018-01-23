package android.puliware.es.baseandroidmvp.model;

/**
 * Created by luipullop on 23/01/18.
 */

import android.puliware.es.baseandroidmvp.view.base.MvpPresenter;

import java.lang.ref.SoftReference;


/**
 * Base class that implements the Model interface and provides a base implementation for
 * attachPresenter() and detachPresenter(). It also handles keeping a weak reference to the
 * mvpPresenter that
 * can be accessed from the children classes by calling getMvpPresenter().
 */
public class BaseModel<T extends MvpPresenter> implements Model<T> {

    /**
     * A SoftReference used to access methods in the View layer
     */
    private SoftReference<T> mPresenter;

    @Override
    public void attachPresenter(T presenter) {
        mPresenter = new SoftReference<>(presenter);
    }

    @Override
    public void detachPresenter() {
        mPresenter = null;
    }

    public T getPresenter() {
        return mPresenter.get();
    }

    public void checkPresenterAttached() {
        if (!isPresenterAttached()) throw new BaseModel.MvpPresenterNotAttachedException();
    }

    public boolean isPresenterAttached() {
        return mPresenter != null;
    }

    public static class MvpPresenterNotAttachedException extends RuntimeException {
        public MvpPresenterNotAttachedException() {
            super("Please call Model.attachPresenter(Presenter) before" +
                    " requesting data to the Model");
        }
    }

}
