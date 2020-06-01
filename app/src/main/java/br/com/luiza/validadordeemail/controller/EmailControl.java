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

        mainActivity.getTvResultado().setText(mainActivity.getDomain() + " " + emailResultado.getDomain() + "\n" +
                mainActivity.getIs_free() + " " + emailResultado.getIs_free() + "\n" +
                mainActivity.getIs_syntax() + " " + emailResultado.getIs_syntax() + "\n" +
                mainActivity.getIs_domain() + " " + emailResultado.getIs_domain() + "\n" +
                mainActivity.getIs_smtp() + " " + emailResultado.getIs_smtp() + "\n" +
                mainActivity.getIs_verified() + " " + emailResultado.getIs_verified() + "\n" +
                mainActivity.getIs_server_down() + " " + emailResultado.getIs_server_down() + "\n" +
                mainActivity.getIs_greylisted() + " " + emailResultado.getIs_greylisted() + "\n" +
                mainActivity.getIs_disposable() + " " + emailResultado.getIs_disposable() + "\n" +
                mainActivity.getIs_role() + " " + emailResultado.getIs_role() + "\n" +
                mainActivity.getTime_taken() + " " + emailResultado.getTime_taken() + "\n" +
                mainActivity.getStatus() + " " + emailResultado.getStatus() + "\n"
        );


    }
}