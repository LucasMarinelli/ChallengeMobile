package com.example.challenge_mobile


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var senhaEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var cadastroButton: Button
    private lateinit var errorTextView: TextView
    private val usuariosCadastrados = mapOf(
        "teste@exemplo.com" to "123456",
        "user@odonto.com" to "senha123"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.email_input)
        senhaEditText = findViewById(R.id.senha_input)
        loginButton = findViewById(R.id.button_login)
        cadastroButton = findViewById(R.id.button_cadastrar)
        errorTextView = findViewById(R.id.errorTextView)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val senha = senhaEditText.text.toString()

            if (usuariosCadastrados.containsKey(email) && usuariosCadastrados[email] == senha) {
                val intent = Intent(this, PrevisaoSinistroActivity::class.java)
                startActivity(intent)
            } else {
                errorTextView.text = "Essa conta não existe. Por favor faça seu cadastro."
                errorTextView.setTextColor(resources.getColor(R.color.red))
            }
        }

        cadastroButton.setOnClickListener {
            val email = emailEditText.text.toString()

            if (usuariosCadastrados.containsKey(email)) {
                errorTextView.text = "Conta já existente. Por favor faça o login."
                errorTextView.setTextColor(resources.getColor(R.color.red))
            } else {
                val intent = Intent(this, PrevisaoSinistroActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
