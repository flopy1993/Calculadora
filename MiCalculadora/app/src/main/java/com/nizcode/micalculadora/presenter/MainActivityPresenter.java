package com.nizcode.micalculadora.presenter;

public interface MainActivityPresenter {
    //intermediario entre vista e interactor

    void sumar(String number1, String number2);//interactor

    void showError(String error);//view

    void showResult(String resultado);//view
}
