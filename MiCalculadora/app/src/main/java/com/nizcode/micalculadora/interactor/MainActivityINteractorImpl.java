package com.nizcode.micalculadora.interactor;

import com.nizcode.micalculadora.presenter.MainActivityPresenter;

public class MainActivityINteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityINteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
        presenter.showResult(String.valueOf(resultado));
       // presenter.showError(e);
    }
}
