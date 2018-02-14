package android.puliware.es.baseandroidmvp.utils;

/**
 * Created by nexus06 on 14/02/18.
 */

import android.app.Activity;
import android.puliware.es.baseandroidmvp.di.PerActivity;


import javax.inject.Inject;

/**
 * A class that does something.
 * <p>
 * This class has the {@link PerActivity} scope. This means that the Activity and all of its
 * Fragments and child fragments and their dependencies will share the same instance of this class.
 * However, different activity instances will have their own instances.
 * <p>
 * This is not available at the Application.
 */
@PerActivity
public final class PerActivityUtil {

    private final Activity activity;

    @Inject
    PerActivityUtil(Activity activity) {
        this.activity = activity;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the activity's {@link #hashCode()}.
     */
    public String doSomething() {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode();
    }
}
