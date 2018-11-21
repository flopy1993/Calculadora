package com.nizcode.micalculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.nizcode.micalculadora.R;
import com.nizcode.micalculadora.presenter.MainActivityPesenterImpl;
import com.nizcode.micalculadora.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private EditText number1;
    private EditText number2;
    private TextView resultado;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        presenter = new MainActivityPesenterImpl(this);



    }



    public void suma(View view){
       String numberOne = number1.getText().toString();
       String numberTwo = number2.getText().toString();
       presenter.sumar(numberOne, numberTwo);
    }

    @Override
    public void showResult(String result) {
        resultado.setText(result);
    }

    @Override
    public void showError(String error) {
        resultado.setText(error);
    }
}
