package android.puliware.es.baseandroidmvp.view.base;

import android.puliware.es.baseandroidmvp.model.base.UserProfile;

import java.util.List;

/**
 * Created by luipullop on 24/01/18.
 */

public interface IViews {

    /**
     * This interface defines the minimum API needed by the
     * presenter class in the Presenter layer to interact with
     * activity or fragment in the View layer.
     * <p>
     * Ops that presenter needs call
     * <p>
     * Presenter -> View
     */
    public interface MainActivityRequiredViewOps extends MvpView {
        /**
         * Some required function. p.Ej show a list with result from presenter call
         *
         * @param results List of String to display.
         */
        void displayResults(List<String> results);
    }

    /**
     * Presenter -> View
     */
    public interface ItemFragmentRequiredViewOps extends MvpView {
        /**
         * Some required function. p.Ej show a list with result from presenter call
         *
         * @param results List of String to display.
         */
        void showOrderedList(List<String> results);

        void showErrorOnLove();

        void displayResult(UserProfile userProfile);
    }
}
