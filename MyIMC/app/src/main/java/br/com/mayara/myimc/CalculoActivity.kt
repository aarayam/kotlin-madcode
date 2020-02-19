package br.com.mayara.myimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
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







    }
}
