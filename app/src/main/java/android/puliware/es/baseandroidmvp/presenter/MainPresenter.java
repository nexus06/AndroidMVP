package android.puliware.es.baseandroidmvp.presenter;

import android.puliware.es.baseandroidmvp.MVP;
import android.puliware.es.baseandroidmvp.model.MainModel;

import java.util.List;

/**
 * Created by luipullop on 23/01/18.
 */

public class MainPresenter extends BasePresenter<MVP.RequiredViewOps> implements MVP.RequiredPresenterOps, MVP.ProvidedPresenterOps{

    private MainModel model;

    @Override
    public void onCreate(MVP.RequiredViewOps view) {
        super.attachView(view);
        model = new MainModel();
        model.onCreate(this);
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
