package com.unicid.alunoscheckin.view

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import com.unicid.alunoscheckin.R

class ScanActivity : AppCompatActivity() {

    lateinit var spinner: Spinner
    lateinit var adapter: ArrayAdapter<String>


    var i: Int? = null


    private val obterResultado = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        val intentResult = IntentIntegrator.parseActivityResult(it.resultCode, it.data)
        if (intentResult.contents != null) {
            Toast.makeText(this, intentResult.contents, Toast.LENGTH_LONG).show()
            val navegador = Intent(Intent.ACTION_VIEW)
            navegador.data = Uri.parse(intentResult.contents)
            //startActivity(navegador)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)
        var it = intent
        supportActionBar!!.hide()
        var aux = it.getStringExtra("aux")
        if (aux != "aux") {
            val integrator: IntentIntegrator = IntentIntegrator(this)
            integrator.setPrompt("Leitura de QRCode")
            obterResultado.launch(integrator.createScanIntent())
        }


        var num = it.getIntExtra("presenca", 0)
        var num2 = it.getIntExtra("presenca2", 0)
        var num3 = it.getIntExtra("presenca3", 0)
        var num4 = it.getIntExtra("presenca4", 0)
        var num5 = it.getIntExtra("presenca5", 0)
        var num6 = it.getIntExtra("presenca6", 0)
        var num7 = it.getIntExtra("presenca7", 0)
        var num8 = it.getIntExtra("presenca8", 0)
        var aluno = it.getStringExtra("aluno")
        var iti = Intent(this@ScanActivity, AlunosDashboard::class.java)
        iti.putExtra("presenca",num)
        iti.putExtra("presenca2",num2)
        iti.putExtra("presenca3",num3)
        iti.putExtra("presenca4",num4)
        iti.putExtra("presenca5",num5)
        iti.putExtra("presenca6",num6)
        iti.putExtra("presenca7",num7)
        iti.putExtra("presenca8",num8)
        iti.putExtra("aluno",aluno)

        var textNomeUsuario: TextView = findViewById(R.id.textNomeUsuario)
        textNomeUsuario.setText(aluno);




        var data= arrayListOf<String>("Projeto Interdisciplinar I","Projeto Interdisciplinar II", "Projeto Interdisciplinar III", "Projeto Interdisciplinar IV",
            "Algoritmo e Lógica de Programação ", "Banco de Dados", "Análise e Projeto de Sistemas I", "Análise e Projeto de Sistemas II")
        adapter = ArrayAdapter(applicationContext,android.R.layout.simple_spinner_dropdown_item,data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner = findViewById(R.id.spinner) as Spinner
        spinner.adapter=adapter
        spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {




                var teste = adapter.getItem(p2).toString()

                if (adapter.getItem(p2).toString() == "Projeto Interdisciplinar I"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num.toString());

                }
                if (adapter.getItem(p2).toString() == "Projeto Interdisciplinar II"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num2.toString());

                }
                if (adapter.getItem(p2).toString() == "Projeto Interdisciplinar III"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num3.toString());

                }
                if (adapter.getItem(p2).toString() == "Projeto Interdisciplinar IV"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num4.toString());

                }
                if (adapter.getItem(p2).toString() == "Algoritmo e Lógica de Programação"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num5.toString());

                }
                if (adapter.getItem(p2).toString() == "Banco de Dados"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num6.toString());

                }
                if (adapter.getItem(p2).toString() == "Análise e Projeto de Sistemas I"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num7.toString());

                }
                if (adapter.getItem(p2).toString() == "Análise e Projeto de Sistemas II"){
                    var textView: TextView = findViewById(R.id.textView)
                    textView.setText("Número de Presença "+num8.toString());

                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }






        val btnsair: Button = findViewById(R.id.btnFechar)
        btnsair.setOnClickListener{
            finish()
        }



        val btniniciar: Button = findViewById(R.id.btnRelatorio)
        btniniciar.setOnClickListener{

            startActivity(iti)
            finish()
        }


    }

    fun find(num: Int?){

    }
}