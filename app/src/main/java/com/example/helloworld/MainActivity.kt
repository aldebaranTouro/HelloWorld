package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregaItens()
    }

    fun carregaItens(){

        val botao: Button = findViewById(R.id.botao)
        val texto: TextView = findViewById(R.id.helloText)

        msgHello(botao, texto)
    }

    fun msgHello(botao: Button, texto: TextView){
        botao.setOnClickListener {
            texto.text = "Hello World"
            botao.text = "Limpar tela"
            if (texto.text != "")
                limparTela(botao, texto)
        }
    }

    fun limparTela(botao: Button, texto: TextView){
        botao.setOnClickListener {
            texto.text = ""
            botao.text = "Mensagem"
            msgHello(botao, texto)
        }
    }
}