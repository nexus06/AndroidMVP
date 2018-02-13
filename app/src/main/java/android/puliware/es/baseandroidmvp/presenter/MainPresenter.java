package android.puliware.es.baseandroidmvp.presenter;

import android.puliware.es.baseandroidmvp.model.MainModel;
import android.puliware.es.baseandroidmvp.presenter.base.BasePresenter;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by luipullop on 23/01/18.
 */

public class MainPresenter extends BasePresenter<IViews.MainActivityRequiredViewOps> implements IPresenters.MainRequiredPresenterOps, IPresenters.MainProvidedPresenterOps{

    private MainModel model;


    @Override
    public void onCreate(IViews.MainActivityRequiredViewOps view) {
        super.attachView(view);
        model = new MainModel();
        model.onCreate(this);
    }

    @Inject
    public MainPresenter(IViews.MainActivityRequiredViewOps view, MainModel model) {
        super.attachView(view);
        this.model = model;
        this.model.onCreate(this);
    }

    @Override
    public void onDestroy(boolean isChangingConfigurations) {
        super.detachView();
        model.onDestroy(true);
    }

    @Override
    public boolean somefunction(String acronym) {
        model.getSomeInformation(acronym);
        return true;
    }

    @Override
    public void onResult(List<String> results) {
        getMvpView().displayResults(results);
    }
}
