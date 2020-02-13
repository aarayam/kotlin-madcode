package br.com.mariliamessias.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnEntrarLogin.setOnClickListener {

            val usuario = edtUsuarioLogin.text.toString().trim()
            val senha = edtSenhaLogin.text.toString().trim()

            if(usuario.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Preencha o Usuário", Toast.LENGTH_LONG).show()
                            //(contexto, mensagem, duração da mensagem)
            } else if (senha.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Preencha a Senha", Toast.LENGTH_LONG).show()
            } else if (usuario == "Mayara") {
                if (senha == "123") {
                    Toast.makeText(this@LoginActivity, "Usuário Logado", Toast.LENGTH_LONG).show()
                }
            }

        }


    }
}
