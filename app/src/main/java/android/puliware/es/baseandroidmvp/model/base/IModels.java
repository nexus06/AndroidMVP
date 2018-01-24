package android.puliware.es.baseandroidmvp.model.base;

import android.puliware.es.baseandroidmvp.common.ModelOps;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;

/**
 * Created by luipullop on 24/01/18.
 */

public interface IModels {
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
    public interface MainProvidedModelOps extends ModelOps<IPresenters.MainRequiredPresenterOps> {
        /**
         * Provided function to presenter
         */
        void getSomeInformation(String parameter);

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
    public interface ItemFragmentProvidedModelOps extends ModelOps<IPresenters.ItemFragmentRequiredPresenterOps> {
        /**
         * Provided function to presenter
         */
        void getLoveFromExternalSource(String parameter);

    }
}
