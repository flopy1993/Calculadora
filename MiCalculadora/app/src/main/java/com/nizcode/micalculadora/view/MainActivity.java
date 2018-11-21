package com.nizcode.micalculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.nizcode.micalculadora.R;
import com.nizcode.micalculadora.presenter.MainActivityPesenterImpl;
import com.nizcode.micalculadora.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private MainActivityPresenter presneter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPesenterImpl(this);

    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showError(String error) {

    }

    public void suma(View view){

    }
}
