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
}
