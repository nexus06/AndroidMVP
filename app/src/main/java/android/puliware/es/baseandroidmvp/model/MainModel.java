package android.puliware.es.baseandroidmvp.model;

import android.puliware.es.baseandroidmvp.MVP;

/**
 * Created by luipullop on 23/01/18.
 */

public class MainModel extends BaseModel<MVP.RequiredPresenterOps> implements MVP.ProvidedModelOps{


    @Override
    public void onCreate(MVP.RequiredPresenterOps presenterOps) {
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
