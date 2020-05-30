package br.com.luiza.validadordeemail.controller;

import android.content.Context;
import android.widget.EditText;

import br.com.luiza.validadordeemail.api.VerificaEmail;
import br.com.luiza.validadordeemail.model.Email;
import br.com.luiza.validadordeemail.view.MainActivity;

public class EmailControl {

    private MainActivity mainActivity;
    private VerificaEmail verificaEmail;
    private Email emailResultado;


    public EmailControl(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        verificaEmail = new VerificaEmail();
        emailResultado = new Email();
    }

    public void verificarEmail(String email) {
        emailResultado = verificaEmail.buscaEmail(email);

        mainActivity.getTvResultado().setText("domain");
    }
}