package br.com.mayara.myimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_calculo.*

class CalculoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val listaSexo = arrayListOf("Sexo", "Feminino", "Masculino", "Outros")

        val sexoAdapter = ArrayAdapter(
            this@CalculoActivity,
            android.R.layout.simple_spinner_dropdown_item,
            listaSexo
        )

        spnSexo.adapter = sexoAdapter

        btnTabela.setOnClickListener {
            startActivity(Intent(this@CalculoActivity, TabelaActivity::class.java))
        }



        btnCalcular.setOnClickListener {

            //Apagar depois..
            val txvAltura = "1.50"
            val txvPesoValor = "60"
            //

            val altura = txvAltura.toFloat()
            val peso = txvPesoValor.toFloat()

            val imc = peso / (altura * altura)
            val resultado = imc.toString()
            val classificacao = "Levemente acima do peso"

            AlertDialog.Builder(this@CalculoActivity)
                .setTitle("Seu IMC é...$resultado")
                .setMessage(classificacao)
                .setPositiveButton("Ok") { _, _ ->

                }
                .setCancelable(true)
                .create()
                .show()
        }















    }
}
