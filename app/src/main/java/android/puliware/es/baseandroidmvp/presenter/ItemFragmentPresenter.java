package android.puliware.es.baseandroidmvp.presenter;

import android.puliware.es.baseandroidmvp.model.ItemFragmentModel;
import android.puliware.es.baseandroidmvp.presenter.base.BasePresenter;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import java.util.List;

/**
 * Created by luipullop on 23/01/18.
 */

public class ItemFragmentPresenter extends BasePresenter<IViews.ItemFragmentRequiredViewOps> implements
        IPresenters.ItemFragmentProvidedPresenterOps,
        IPresenters.ItemFragmentRequiredPresenterOps{

    private ItemFragmentModel model;


    @Override
    public void onCreate(IViews.ItemFragmentRequiredViewOps view) {
        super.attachView(view);
        model = new ItemFragmentModel();
        model.onCreate(this);
    }

    @Override
    public void onDestroy(boolean isChangingConfigurations) {
        super.detachView();
        model.onDestroy(true);
    }

    @Override
    public boolean giveMeLove(String acronym) {
        //TODO model....
        model.getLoveFromExternalSource(acronym);
        return true;
    }

    @Override
    public void onLoveSuccesed(List<String> results) {
        getMvpView().showOrderedList(results);

    }

    @Override
    public void onLoveError(String results) {
        getMvpView().showErrorOnLove();
    }

    @Override
    public void showProgress() {
        //TODO call to some method in the view layer bla bla bla
    }
}
