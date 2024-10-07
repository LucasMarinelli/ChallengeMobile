package com.example.challenge_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesPacienteActivity : AppCompatActivity() {

    private fun gerarRiscoAleatorio(): String {
        val risco = (1..100).random()
        return "Risco de sinistro: $risco%"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_paciente)

        val nomeEditText: EditText = findViewById(R.id.nomeEditText)
        val idEditText: EditText = findViewById(R.id.idEditText)
        val idadeEditText: EditText = findViewById(R.id.idadeEditText)
        val riscoTextView: TextView = findViewById(R.id.riscoTextView)
        val botaoAcoesPreventivas: Button = findViewById(R.id.botaoAcoesPreventivas)

        riscoTextView.text = gerarRiscoAleatorio()

        botaoAcoesPreventivas.setOnClickListener {
            val intent = Intent(this, AcoesPreventivasActivity::class.java)
            startActivity(intent)
        }
    }
}
