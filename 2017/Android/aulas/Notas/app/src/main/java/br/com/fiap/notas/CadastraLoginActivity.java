package br.com.fiap.notas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import br.com.fiap.notas.util.ArquivoDB;

public class CadastraLoginActivity extends AppCompatActivity {

    private EditText etNome, etSobrenome, etDataNascimento, etEmail, etSenha;
    private RadioGroup rgSexo;
    private ArquivoDB arquivoDB;
    private HashMap<String, String> mapDados;

    private final String ARQ = "dados.txt";
    private final String SP = "dados";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastra_login);

        etNome = (EditText) findViewById(R.id.edtNome);
        etSobrenome = (EditText) findViewById(R.id.edtSobrenome);
        etDataNascimento = (EditText) findViewById(R.id.edtDataNascimento);
        etEmail = (EditText) findViewById(R.id.edtEmail);
        etSenha = (EditText) findViewById(R.id.edtSenha);

        rgSexo = (RadioGroup) findViewById(R.id.rgSexo);

        arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();
    }

    public void gravarChaves(View v) {
        if (capturaDadosDaTela()) {
            arquivoDB.gravarChaves(this, SP, mapDados);
            Toast.makeText(this, R.string.cadastro_sucesso, Toast.LENGTH_SHORT).show();
        }
    }

    public void excluirChaves(View v) {
        if (capturaDadosDaTela()) {
            arquivoDB.excluirChaves(this, SP, mapDados);
            Toast.makeText(this, R.string.exclusao_sucesso  , Toast.LENGTH_SHORT).show();
        }
    }

    public void carregarChaves(View v) {
        if (verificarChaves(v)) {
            String sexo = arquivoDB.retornarValor(this, SP, "sexo");

            etNome.setText(arquivoDB.retornarValor(this, SP, "nome"));
            etSobrenome.setText(arquivoDB.retornarValor(this, SP, "sobrenome"));
            etDataNascimento.setText(arquivoDB.retornarValor(this, SP, "data_nascimento"));
            etEmail.setText(arquivoDB.retornarValor(this, SP, "usuario"));
            etSenha.setText(arquivoDB.retornarValor(this, SP, "senha"));

            if (sexo.equals(getString(R.string.feminino))) {
                rgSexo.check(R.id.rbFeminino);
            }
            else {
                rgSexo.check(R.id.rbMasculino);
            }
        }
    }

    public void gravarArquivo(View v) {
        if (capturaDadosDaTela()) {
            try {
                arquivoDB.gravarArquivo(this, ARQ, mapDados.toString());
                Toast.makeText(this, R.string.gravar_arquivo_ok, Toast.LENGTH_SHORT).show();
            }
            catch(IOException e) {
                e.printStackTrace();
                Toast.makeText(this, R.string.gravar_arquivo_nok, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void lerArquivo(View v) {
        try {
            String txt = arquivoDB.lerArquivo(this, ARQ);
            Toast.makeText(this, txt, Toast.LENGTH_LONG).show();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.ler_arquivo_nok, Toast.LENGTH_SHORT).show();
        }
    }

    public void excluirArquivo(View v) {
        try {
            arquivoDB.excluirArquivo(this, ARQ);
            Toast.makeText(this, R.string.excluir_arquivo_ok, Toast.LENGTH_SHORT).show();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.excluir_arquivo_nok, Toast.LENGTH_SHORT).show();
        }
    }

    public void verificarDados(View v) {
        verificarChaves(v);
    }

    public boolean verificarChaves(View v){
        if (arquivoDB.verificarChave(this, SP, "usuario") 
        && arquivoDB.verificarChave(this, SP, "senha")) {
            Toast.makeText(this, R.string.dados_login_existem, Toast.LENGTH_SHORT).show();
            return true;
        }

        Toast.makeText(this, R.string.dados_login_n_existem, Toast.LENGTH_SHORT).show();
        return false;
    }

    public void voltar(View v) {
        finish();
    }

    private boolean capturaDadosDaTela() {
        String nome, sobrenome, dataNascimento, email, senha, sexo;
        RadioButton rbSexo = null;
        boolean isOk = false;
        int sexoId = 0;

        nome = etNome.getText().toString();
        sobrenome = etSobrenome.getText().toString();
        dataNascimento = etDataNascimento.getText().toString();
        email = etEmail.getText().toString();
        senha = etSenha.getText().toString();

        sexoId = rgSexo.getCheckedRadioButtonId();
        rbSexo = (RadioButton) findViewById(sexoId);

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()
        && !TextUtils.isEmpty(senha)
        && !TextUtils.isEmpty(nome)
        && !TextUtils.isEmpty(sobrenome)
        && !TextUtils.isEmpty(dataNascimento)
        && sexoId != -1) {
            isOk = true;
            sexo = rbSexo.getText().toString();

            mapDados.put("usuario", email);
            mapDados.put("senha", senha);
            mapDados.put("nome", nome);
            mapDados.put("sobrenome", sobrenome);
            mapDados.put("data_nascimento", dataNascimento);
            mapDados.put("sexo", sexo);
        }
        else {
            Toast.makeText(this, R.string.dados_conta_nok, Toast.LENGTH_SHORT).show();
        }

        return isOk;
    }
}
