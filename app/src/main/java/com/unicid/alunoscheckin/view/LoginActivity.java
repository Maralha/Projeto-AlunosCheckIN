package com.unicid.alunoscheckin.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



import com.google.android.gms.common.api.GoogleApiClient;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;

import com.unicid.alunoscheckin.R;
import com.unicid.alunoscheckin.controller.AlunosController;
import com.unicid.alunoscheckin.controller.DisciplinasController;

import com.unicid.alunoscheckin.datasource.AppDataBase;
import com.unicid.alunoscheckin.model.Alunos;
import com.unicid.alunoscheckin.model.Disciplinas;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener, GoogleApiClient.ConnectionCallbacks {


    Button btnEntrar;
    Button btnCadastrar;
    public static EditText editRgm;
    public static EditText editSenha;
    Intent intent;
    CheckBox ckCaptcha;

    Disciplinas disciplinas;
    DisciplinasController disciplinasController;
    Alunos alunos;
    AlunosController alunosController;
    public static final String TAG = "@ALUNOS_CHECKIN";
    String return_rgm;
    String return_senha;
    AppDataBase appDataBase;
    SQLiteDatabase sqLiteDatabase;
    GoogleApiClient googleApiClient;

    String copiaChave = "6LcvGEojAAAAAETcsvE1uIeCrzUYu3KNT5gNv6kl";
    String chaveSite = "6LcvGEojAAAAAETcsvE1uIeCrzUYu3KNT5gNv6kl";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        findElementsByID();
        startApplication();
        forceFields();


        disciplinasController = new DisciplinasController(getApplicationContext());
        alunosController = new AlunosController(getApplicationContext());


    }



    protected void startApplication(){
        btnEntrar.setEnabled(false);
    }



    protected void findElementsByID(){
        btnEntrar = findViewById(R.id.btnEntrar);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        editRgm = findViewById(R.id.editRgm);
        editSenha = findViewById(R.id.editSenha);
        ckCaptcha = findViewById(R.id.ckCaptcha);
    }

    protected void forceFields(){


        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(editRgm.getText().toString()) && TextUtils.isEmpty(editSenha.getText().toString())){
                    editRgm.setError("*");
                    editSenha.setError("*");
                } if(TextUtils.isEmpty(editRgm.getText().toString())){
                    editRgm.setError("*");
                } if(TextUtils.isEmpty(editSenha.getText().toString())){
                    editSenha.setError("*");
                } else {

                    String rgm = editRgm.getText().toString();
                    String senha = editSenha.getText().toString();

                    appDataBase = new AppDataBase(getApplicationContext());

                    Boolean validar = AppDataBase.validarLogin(rgm, senha);


                    if(validar){
                        Toast.makeText(LoginActivity.this,  "Seja bem Vindo: "+AppDataBase.boasVindasUsuario(rgm), Toast.LENGTH_SHORT).show();
                        String aluno = AppDataBase.boasVindasUsuario(rgm);
                        editRgm.setTextColor(Color.GREEN);
                        editSenha.setTextColor(Color.GREEN);

                        intent = new Intent(LoginActivity.this, AlunosDashboard.class);
                        intent.putExtra("aluno", aluno);
                        startActivity(intent);
                        finish();
                    } else {

                        editRgm.setError("RGM e/ou Senha incorretos!");
                        editSenha.setError("Usuário não encontrado. Por favor, informe as credenciais corretamente!");

                    }
                }

            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
                finish();
            }
        });



        googleApiClient = new GoogleApiClient.Builder(this).addApi(SafetyNet.API).addConnectionCallbacks(LoginActivity.this).build();

        googleApiClient.connect();

        ckCaptcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ckCaptcha.isChecked()){
                    SafetyNet.SafetyNetApi.verifyWithRecaptcha(googleApiClient, chaveSite).setResultCallback(new ResultCallback<SafetyNetApi.RecaptchaTokenResult>() {
                        @Override
                        public void onResult(@NonNull SafetyNetApi.RecaptchaTokenResult recaptchaTokenResult) {

                            Status status = recaptchaTokenResult.getStatus();

                            if((status!=null) && status.isSuccess()){
                                Toast.makeText(LoginActivity.this, "Sucesso!!!", Toast.LENGTH_SHORT).show();

                                ckCaptcha.setTextColor(Color.GREEN);

                            }
                        }
                    });
                    btnEntrar.setEnabled(true);
                } else {
                    ckCaptcha.setTextColor(Color.RED);
                    Toast.makeText(LoginActivity.this, "Sem sucesso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }
}