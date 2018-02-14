package android.puliware.es.baseandroidmvp.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.puliware.es.baseandroidmvp.R;
import android.puliware.es.baseandroidmvp.presenter.MainPresenter;
import android.puliware.es.baseandroidmvp.view.base.IViews;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/*The top-most level
injection occurs in onCreate
See https://proandroiddev.com/how-to-android-dagger-2-10-2-11-butterknife-mvp-part-1-eb0f6b970fd
*/
public class MainActivity extends DaggerAppCompatActivity implements IViews.MainActivityRequiredViewOps {

    @Inject
    MainPresenter presenter;

    @Inject
    SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);

        preferences.edit().putBoolean("dsds",true).commit();

        presenter.somefunction("example");
        //https://google.github.io/dagger/android.html
        //https://www.raywenderlich.com/171327/dependency-injection-android-dagger-2
        //https://github.com/google/dagger
        //medium: dagger version 2.11 -> https://medium.com/@iammert/new-android-injector-with-dagger-2-part-1-8baa60152abe
    }

    @Override
    public void displayResults(List<String> results) {
        Toast.makeText(this, "testeando", Toast.LENGTH_LONG).show();
    }
}
