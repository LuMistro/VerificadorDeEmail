package br.com.luiza.validadordeemail.controller;

import android.content.Context;
import android.widget.EditText;

import br.com.luiza.validadordeemail.api.VerificaEmail;
import br.com.luiza.validadordeemail.view.MainActivity;

public class EmailControl {

    private MainActivity mainActivity;
    private VerificaEmail verificaEmail;

    public EmailControl(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        verificaEmail = new VerificaEmail();
    }

    public void pegaDadosTela(String email) {
//        email = mainActivity.getEtEmail().getText().toString();
        System.out.println(email);
        verificaEmail.buscaEmail(email);
//        mainActivity.getTvResultado().setText(verificaEmail.buscaEmail(email));
    }


}
