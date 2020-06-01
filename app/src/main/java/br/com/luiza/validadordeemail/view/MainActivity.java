package br.com.luiza.validadordeemail.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.luiza.validadordeemail.R;
import br.com.luiza.validadordeemail.controller.EmailControl;

public class MainActivity extends AppCompatActivity {


    private EditText etEmail;
    private Button btnVerificar;
    private TextView tvResultado;

    private EmailControl control;

    private String domain;
    private String is_free;
    private String is_syntax;
    private String is_domain;
    private String is_smtp;
    private String is_verified;
    private String is_server_down;
    private String is_greylisted;
    private String is_disposable;
    private String is_role;
    private String time_taken;
    private String status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();
        control = new EmailControl(this);
    }

    private void inicializa() {
        etEmail = findViewById(R.id.etEmail);
        btnVerificar = findViewById(R.id.btnVerificar);
        tvResultado = findViewById(R.id.tvResultado);

        domain = this.getString(R.string.domain);
        is_free = this.getString(R.string.is_free);
        is_syntax = this.getString(R.string.is_syntax);
        is_domain = this.getString(R.string.is_domain);
        is_smtp = this.getString(R.string.is_smtp);
        is_verified = this.getString(R.string.is_verified);
        is_server_down = this.getString(R.string.is_server_down);
        is_greylisted = this.getString(R.string.is_greylisted);
        is_disposable = this.getString(R.string.is_disposable);
        is_role = this.getString(R.string.is_role);
        time_taken = this.getString(R.string.time_taken);
        status = this.getString(R.string.status);
    }

    public void verificar(View view) {
        control.verificarEmail(etEmail.getText().toString());
    }

    public EditText getEtEmail() {
        return etEmail;
    }

    public void setEtEmail(EditText etEmail) {
        this.etEmail = etEmail;
    }

    public Button getBtnVerificar() {
        return btnVerificar;
    }

    public void setBtnVerificar(Button btnVerificar) {
        this.btnVerificar = btnVerificar;
    }

    public TextView getTvResultado() {
        return tvResultado;
    }

    public void setTvResultado(TextView tvResultado) {
        this.tvResultado = tvResultado;
    }

    public EmailControl getControl() {
        return control;
    }

    public void setControl(EmailControl control) {
        this.control = control;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIs_free() {
        return is_free;
    }

    public void setIs_free(String is_free) {
        this.is_free = is_free;
    }

    public String getIs_syntax() {
        return is_syntax;
    }

    public void setIs_syntax(String is_syntax) {
        this.is_syntax = is_syntax;
    }

    public String getIs_domain() {
        return is_domain;
    }

    public void setIs_domain(String is_domain) {
        this.is_domain = is_domain;
    }

    public String getIs_smtp() {
        return is_smtp;
    }

    public void setIs_smtp(String is_smtp) {
        this.is_smtp = is_smtp;
    }

    public String getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(String is_verified) {
        this.is_verified = is_verified;
    }

    public String getIs_server_down() {
        return is_server_down;
    }

    public void setIs_server_down(String is_server_down) {
        this.is_server_down = is_server_down;
    }

    public String getIs_greylisted() {
        return is_greylisted;
    }

    public void setIs_greylisted(String is_greylisted) {
        this.is_greylisted = is_greylisted;
    }

    public String getIs_disposable() {
        return is_disposable;
    }

    public void setIs_disposable(String is_disposable) {
        this.is_disposable = is_disposable;
    }

    public String getIs_role() {
        return is_role;
    }

    public void setIs_role(String is_role) {
        this.is_role = is_role;
    }

    public String getTime_taken() {
        return time_taken;
    }

    public void setTime_taken(String time_taken) {
        this.time_taken = time_taken;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
