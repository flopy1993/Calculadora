package com.nizcode.micalculadora.presenter;

import com.nizcode.micalculadora.interactor.MainActivityINteractorImpl;
import com.nizcode.micalculadora.interactor.MainActivityInteractor;
import com.nizcode.micalculadora.view.MainActivityView;

public class MainActivityPesenterImpl implements MainActivityPresenter {

    private MainActivityView activityView;
    private MainActivityInteractor interactor;

    public MainActivityPesenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interactor = new MainActivityINteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1, number2);
    }

    @Override
    public void showError(String error) {
        activityView.showError(error);
    }

    @Override
    public void showResult(String resultado) {
        activityView.showResult(resultado);

    }
}
