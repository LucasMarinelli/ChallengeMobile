package com.example.challenge_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RelatorioFinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio_final)

        val riscoPosAcoesTextView: TextView = findViewById(R.id.riscoPosAcoesTextView)
        val statusPacienteTextView: TextView = findViewById(R.id.statusPacienteTextView)
        val botaoVoltarInicio: Button = findViewById(R.id.botaoVoltarInicio)

        riscoPosAcoesTextView.text = "Risco de sinistro pós ações preventivas: 15%"
        statusPacienteTextView.text = "Status atual do paciente: Não necessita de ações preventivas."

        botaoVoltarInicio.setOnClickListener {
            val intent = Intent(this, PrevisaoSinistroActivity::class.java)
            startActivity(intent)
        }
    }
}
