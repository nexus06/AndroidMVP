package android.puliware.es.baseandroidmvp.utils;

/**
 * Created by nexus06 on 14/02/18.
 */

import android.app.Fragment;
import android.puliware.es.baseandroidmvp.di.PerFragment;

import javax.inject.Inject;

/**
 * A class that does something.
 * <p>
 * This class has the {@link PerFragment} scope. This means that the Activity and all of its
 * Fragments and child fragments and their dependencies will share the same instance of this class.
 * However, different activity instances will have their own instances.
 * <p>
 * This is not available at the Application.
 */
@PerFragment
public final class PerFragmentUtil {

    private final Fragment fragment;

    @Inject
    PerFragmentUtil(Fragment fragment) {
        this.fragment = fragment;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the fragment's {@link #hashCode()}.
     */
    public String doSomething() {
        return "PerFragmentUtil: " + hashCode() + ", fragment: " + fragment.hashCode();
    }
}
