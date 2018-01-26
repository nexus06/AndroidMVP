package android.puliware.es.baseandroidmvp.view;

import android.os.Bundle;
import android.puliware.es.baseandroidmvp.R;
import android.puliware.es.baseandroidmvp.presenter.MainPresenter;
import android.puliware.es.baseandroidmvp.view.base.IViews;

import java.util.List;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements IViews.MainActivityRequiredViewOps {

    private MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidInjection.inject(this);
        presenter = new MainPresenter();
        presenter.onCreate(this);
        presenter.somefunction("example");
        //https://google.github.io/dagger/android.html
        //https://www.raywenderlich.com/171327/dependency-injection-android-dagger-2
        //https://github.com/google/dagger
        //medium: dagger version 2.11 -> https://medium.com/@iammert/new-android-injector-with-dagger-2-part-1-8baa60152abe
    }

    @Override
    public void displayResults(List<String> results) {
        //TODO hook method called from presenter you must implement
    }
}
