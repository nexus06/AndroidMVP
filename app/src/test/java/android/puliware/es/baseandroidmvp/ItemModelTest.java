package android.puliware.es.baseandroidmvp;

import android.puliware.es.baseandroidmvp.model.ItemFragmentModel;
import android.puliware.es.baseandroidmvp.model.base.UserProfile;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.observers.TestObserver;
import io.reactivex.schedulers.Schedulers;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by nexus06 on 31/01/18.
 */
@RunWith(MockitoJUnitRunner.class)
public class ItemModelTest {
    private static final String USER = "Chuck";
    ItemFragmentModel modelTest;

    @BeforeClass
    public static void setupClass() {
        //overrride Rx Schedulers
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(
                __ -> Schedulers.trampoline());
    }

    @Before
    public void setUp() {
        modelTest = new ItemFragmentModel();
    }

    @Test
    public void testGetUserProfile() throws Exception {
        TestObserver<UserProfile> a = modelTest.getProfile().test();
        //await for async call finishes
        a.awaitTerminalEvent();
        assertThat(a.values().get(0).name(), is(USER));
    }
}

