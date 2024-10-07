package com.example.challenge_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrevisaoSinistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previsao_sinistro)

        val previsaoTextView: TextView = findViewById(R.id.previsaoTextView)
        val botaoDetalhesPaciente: Button = findViewById(R.id.botaoDetalhesPaciente)

        previsaoTextView.text = """
            Previsão de Sinistros em 2023:
            - Janeiro: 30 sinistros
            - Fevereiro: 79 sinistros
            - Março: 48 sinistros
            - ...
        """.trimIndent()

        botaoDetalhesPaciente.setOnClickListener {
            val intent = Intent(this, DetalhesPacienteActivity::class.java)
            startActivity(intent)
        }
    }
}
