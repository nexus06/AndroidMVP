package android.puliware.es.baseandroidmvp.model;

import android.puliware.es.baseandroidmvp.model.base.BaseModel;
import android.puliware.es.baseandroidmvp.model.base.IModels;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;

/**
 * Created by luipullop on 23/01/18.
 */

public class MainModel extends BaseModel<IPresenters.MainRequiredPresenterOps> implements IModels.MainProvidedModelOps{


    @Override
    public void onCreate(IPresenters.MainRequiredPresenterOps presenterOps) {
        attachPresenter(presenterOps);
    }

    @Override
    public void onDestroy(boolean isChangingConfigurations) {

    }

    @Override
    public void getSomeInformation(String parameter) {
        //whatever
        getPresenter().onResult(null);
    }
}
