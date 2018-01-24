package android.puliware.es.baseandroidmvp;

import android.puliware.es.baseandroidmvp.common.ModelOps;
import android.puliware.es.baseandroidmvp.common.PresenterOps;
import android.puliware.es.baseandroidmvp.presenter.base.MvpPresenter;
import android.puliware.es.baseandroidmvp.view.base.MvpView;

import java.util.List;

/**
 * Only for refernence. If more than one view (activity / fragments) is wanted
 * each one with its presenter and model/s is better split as in IViews, MVPPresenter, IModels.
 * But it describes the BASIC interfaces for the application that are
 * required and provided by the layers in the Model-View-Presenter
 * (MVP) pattern.  This design ensures loose coupling between the
 * layers in the app's MVP-based architecture.
 */

@Deprecated
public interface MVP {
    /**
     * This interface defines the minimum API needed by the
     * presenter class in the Presenter layer to interact with
     * activity or fragment in the View layer.
     *
     * Ops that presenter needs call
     *
     * Presenter -> View
     *
     */
    public interface RequiredViewOps extends MvpView {
        /**
         *
         * Some required function. p.Ej show a list with result from presenter call
         *
         * @param results
         *            List of String to display.
         */
        void displayResults(List<String> results);
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
    public interface ProvidedPresenterOps extends PresenterOps<RequiredViewOps> {
        /**
         * some function provided to other layers
         */
        boolean somefunction(String acronym);
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
    public interface RequiredPresenterOps extends MvpPresenter {
        void onResult(List<String> results);
    }

    /**
     * This interface defines the minimum public API provided by the
     * Model class in the Model layer to the Presenter
     * class in the Presenter layer.  It extends the ModelOps
     * interface, which is parametrized by the
     * MVP.RequiredPresenterOps interface used to define the argument
     * passed to the onConfigurationChange() method.
     *
     * Presenter -> Model
     *
     */
    public interface ProvidedModelOps extends ModelOps<RequiredPresenterOps> {
        /**
         * Provided function to presenter
         */
        void getSomeInformation(String parameter);

    }
}
