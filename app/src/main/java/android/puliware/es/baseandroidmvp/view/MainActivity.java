package android.puliware.es.baseandroidmvp.view;

import android.os.Bundle;
import android.puliware.es.baseandroidmvp.R;
import android.puliware.es.baseandroidmvp.presenter.MainPresenter;
import android.puliware.es.baseandroidmvp.view.base.IViews;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IViews.MainActivityRequiredViewOps {

    private MainPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter();
        presenter.onCreate(this);
        presenter.somefunction("example");
        //TODO inject with dagger2 instead: https://www.raywenderlich.com/171327/dependency-injection-android-dagger-2
        //https://google.github.io/dagger/android.html
    }

    @Override
    public void displayResults(List<String> results) {
        //TODO hook method called from presenter you must implement
    }
}
