package android.puliware.es.baseandroidmvp;

import android.puliware.es.baseandroidmvp.model.ItemFragmentModel;
import android.puliware.es.baseandroidmvp.model.base.UserProfile;
import android.puliware.es.baseandroidmvp.presenter.ItemFragmentPresenter;
import android.puliware.es.baseandroidmvp.presenter.base.IPresenters;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by nexus06 on 31/01/18.
 */
@RunWith(MockitoJUnitRunner.class)
public class ItemPresenterTest {
    @Mock
    ItemFragmentModel interactor;
    @Mock
    IViews.ItemFragmentRequiredViewOps viewOps;

    ItemFragmentPresenter presenter;

    @BeforeClass
    public static void setupClass() {
        /*
        we need override Rx Schedulers before
        https://medium.com/@peter.tackage/overriding-rxandroid-schedulers-in-rxjava-2-5561b3d14212*/
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(
                __ -> Schedulers.trampoline());
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        Mockito.when(interactor.getProfile()).thenReturn(Observable.just(UserProfile.create("Chuck",8)));
        presenter = new ItemFragmentPresenter();
        presenter.onCreate(viewOps);
    }

    @Test
    public void testDisplayCalled() {
        presenter.fetchUserAndDisplay();
        Mockito.verify(viewOps).displayResult(ArgumentMatchers.any());
    }
}

