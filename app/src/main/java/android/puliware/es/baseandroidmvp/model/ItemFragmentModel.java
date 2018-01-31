package android.puliware.es.baseandroidmvp.model;

import android.puliware.es.baseandroidmvp.model.base.BaseModel;
import android.puliware.es.baseandroidmvp.model.base.IModels;
import android.puliware.es.baseandroidmvp.model.base.UserProfile;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

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

    /*  Let’s follow an example for the full article.
     The Model is class that provides the user profile as an Observable
    (we don’t know if it comes from a local database or from the Internet), and it is defined with an Interface.
    */
    @Override
    public Observable<UserProfile> getProfile() {

     /*   One of the most common operations when dealing with asynchronous tasks on Android is to observe the task's result
        or outcome on the main thread. Using vanilla Android, this would typically be accomplished with an AsyncTask.
                With RxJava instead you would declare your Observable to be observed on the main thread:*/
        return Observable.just(UserProfile.create("Chuck", 8))
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
