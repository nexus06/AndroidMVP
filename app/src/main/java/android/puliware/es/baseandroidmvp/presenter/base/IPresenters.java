package android.puliware.es.baseandroidmvp.presenter.base;

import android.puliware.es.baseandroidmvp.common.PresenterOps;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import java.util.List;

/**
 * Created by luipullop on 24/01/18.
 */

public interface IPresenters {
    /**
     * This interface defines the minimum public API provided by the
     * presenter class in the Presenter layer to the
     * activity in the View layer.  It extends the
     * PresenterOps interface, which is instantiated by the
     * MVP.RequiredViewOps interface used to define the parameter
     * that's passed to the onConfigurationChange() method.
     *
     *
     * View -> Presenter
     *
     */
    public interface MainProvidedPresenterOps extends PresenterOps<IViews.MainActivityRequiredViewOps> {
        /**
         * some function provided to other layers
         */
        boolean somefunction(String acronym);
    }

    /**
     * This interface defines the minimum public API provided by the
     * presenter class in the Presenter layer to the
     * activity in the View layer.  It extends the
     * PresenterOps interface, which is instantiated by the
     * MVP.RequiredViewOps interface used to define the parameter
     * that's passed to the onConfigurationChange() method.
     *
     *
     * View -> Presenter
     *
     */
    public interface ItemFragmentProvidedPresenterOps extends PresenterOps<IViews.ItemFragmentRequiredViewOps> {
        /**
         * some function provided to other layers
         */
        boolean giveMeLove(String acronym);
    }

    /**
     * This interface defines the minimum API needed by the
     * Model class in the Model layer to interact with
     * Presenter class in the Presenter layer.  Since this
     * interface is identical to the one used by the RequiredViewOps
     * interface it simply extends it.
     *
     * Model -> Presenter
     *
     */
    public interface MainRequiredPresenterOps extends MvpPresenter {
        void onResult(List<String> results);
    }

    /**
     * This interface defines the minimum API needed by the
     * Model class in the Model layer to interact with
     * Presenter class in the Presenter layer.  Since this
     * interface is identical to the one used by the RequiredViewOps
     * interface it simply extends it.
     *
     * Model -> Presenter
     *
     */
    public interface ItemFragmentRequiredPresenterOps extends MvpPresenter {
        void onLoveSuccesed(List<String> results);
        void onLoveError(String results);
        void showProgress();
    }
}
