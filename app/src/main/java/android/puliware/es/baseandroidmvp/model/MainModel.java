package android.puliware.es.baseandroidmvp.model;

import android.puliware.es.baseandroidmvp.model.base.BaseModel;
import android.puliware.es.baseandroidmvp.model.base.IModels;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;

import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Inject;


/**
 * Created by luipullop on 23/01/18.
 */

public class MainModel extends BaseModel<IPresenters.MainRequiredPresenterOps> implements IModels.MainProvidedModelOps{


    @Inject
    public MainModel() {
    }

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
        getPresenter().onResult(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    }
}
