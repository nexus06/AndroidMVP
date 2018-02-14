package android.puliware.es.baseandroidmvp.utils;

/**
 * Created by nexus06 on 14/02/18.
 */

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * A class that does something.
 * <p>
 * This class has the {@link Singleton} scope. This means that the Application and all Activities,
 * Fragments, and child fragments and their dependencies will share the same instance of this class.
 */
@Singleton
public final class SingletonUtil {

    private final Application application;

    @Inject
    SingletonUtil(Application application) {
        this.application = application;
    }

    /**
     * @return the result of the work done here as a string. For this example, this returns its
     * {@link #hashCode()} and the application's {@link #hashCode()}.
     */
    public String doSomething() {
        return "SingletonUtil: " + hashCode() + ", Application: " + application.hashCode();
    }
}
