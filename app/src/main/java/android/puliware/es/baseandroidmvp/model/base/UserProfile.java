package android.puliware.es.baseandroidmvp.model.base;

import com.google.auto.value.AutoValue;

/**
 * Created by nexus06 on 31/01/18.
 */

@AutoValue
public abstract class UserProfile {
    public static UserProfile create(String name, int numberOfLegs) {
        // See "How do I...?" below for nested classes.
        return new AutoValue_UserProfile(name, numberOfLegs);
    }

    public abstract String name();
    public abstract int numberOfLegs();

}
