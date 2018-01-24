package android.puliware.es.baseandroidmvp.model;

import android.puliware.es.baseandroidmvp.model.base.BaseModel;
import android.puliware.es.baseandroidmvp.model.base.IModels;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;

/**
 * Created by luipullop on 23/01/18.
 */

public class ItemFragmentModel extends BaseModel<IPresenters.ItemFragmentRequiredPresenterOps> implements IModels.ItemFragmentProvidedModelOps{


    @Override
    public void onCreate(IPresenters.ItemFragmentRequiredPresenterOps presenterOps) {
        attachPresenter(presenterOps);
    }

    @Override
    public void onDestroy(boolean isChangingConfigurations) {
        if(isPresenterAttached()){
            detachPresenter();
        }
    }

    @Override
    public void getLoveFromExternalSource(String parameter) {
        //TODO get data async from external (RX)
        getPresenter().showProgress();
        //-> onSuccess
        getPresenter().onLoveSuccesed(null);
        //-> onError
        getPresenter().onLoveError("she don't like you");
        //-> onCompleted()
        //getPresenter().dismissProgress();
    }
}
