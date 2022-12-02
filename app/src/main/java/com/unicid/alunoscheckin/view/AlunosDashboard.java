package com.unicid.alunoscheckin.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unicid.alunoscheckin.R;

import org.w3c.dom.Text;


public class AlunosDashboard extends AppCompatActivity {

    TextView prj1;
    TextView prj2;
    TextView prj3;
    TextView prj4;
    TextView Alp;
    TextView Bd;
    TextView Aps1;
    TextView Aps2;
    Button btnNext;
    Intent intent;
    Integer qntPresenca = 0;
    Integer qntPresenca2 = 0;
    Integer qntPresenca3 = 0;
    Integer qntPresenca4 = 0;
    Integer qntPresenca5 = 0;
    Integer qntPresenca6 = 0;
    Integer qntPresenca7 = 0;
    Integer qntPresenca8 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos_dashboard);

        findElementsById();
        navigatorTextViews();



    }

    protected void findElementsById(){
        prj1 = findViewById(R.id.txtPrj1);
        prj2 = findViewById(R.id.txtPrj2);
        prj3 = findViewById(R.id.txtPrj3);
        prj4 = findViewById(R.id.txtPrj4);
        Alp = findViewById(R.id.txtAlp);
        Bd = findViewById(R.id.txtBd);
        Aps1 = findViewById(R.id.txtAps1);
        Aps2 = findViewById(R.id.txtAps2);

    }



    protected void navigatorTextViews(){
        prj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        prj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca2 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        prj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca3 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        prj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca4 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        Alp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca5 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        Bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca6 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        Aps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca7 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        Aps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }

                qntPresenca8 += 1;
                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);
                startActivity(intent);
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(AlunosDashboard.this, ScanActivity.class);
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    qntPresenca = extras.getInt("presenca",0);
                    qntPresenca2 = extras.getInt("presenca2",0);
                    qntPresenca3 = extras.getInt("presenca3",0);
                    qntPresenca4 = extras.getInt("presenca4",0);
                    qntPresenca5 = extras.getInt("presenca5",0);
                    qntPresenca6 = extras.getInt("presenca6",0);
                    qntPresenca7 = extras.getInt("presenca7",0);
                    qntPresenca8 = extras.getInt("presenca8",0);
                }


                intent.putExtra("presenca", qntPresenca);
                intent.putExtra("presenca2", qntPresenca2);
                intent.putExtra("presenca3", qntPresenca3);
                intent.putExtra("presenca4", qntPresenca4);
                intent.putExtra("presenca5", qntPresenca5);
                intent.putExtra("presenca6", qntPresenca6);
                intent.putExtra("presenca7", qntPresenca7);
                intent.putExtra("presenca8", qntPresenca8);

                startActivity(intent);
                finish();
            }
        });


    }


}