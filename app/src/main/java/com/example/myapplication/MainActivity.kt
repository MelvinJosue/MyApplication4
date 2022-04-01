package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.BTNNUMEROS)
        val numerouno:TextView=findViewById(R.id.numero1)
        val numerodos:TextView=findViewById(R.id.numero2)
        val numerotres:TextView=findViewById(R.id.numero3)
        val resultado:TextView=findViewById(R.id.txtresul)
        val reintentar:Button=findViewById(R.id.reintentar)
        var sorpresa=Random()
        var nashe=3
        reintentar.visibility=View.GONE


        button.setOnClickListener {
            val nft1:Int=sorpresa.nextInt(10)+1
            val nft2:Int=sorpresa.nextInt(10)+1
            val nft3:Int=sorpresa.nextInt(10)+1

            if(nft1==7&&nft2==7&&nft3==7) {
                resultado.text="Haz ganado"
                numerouno.text=nft1.toString()
                numerodos.text=nft2.toString()
                numerotres.text=nft3.toString()
                reintentar.visibility=View.VISIBLE
                button.visibility=View.GONE
            }
            else{

                if(nashe==0){
                    resultado.text="Haz perdido"
                    reintentar.visibility=View.VISIBLE
                    button.visibility=View.GONE
                }
                else{
                    numerouno.text=nft1.toString()
                    numerodos.text=nft2.toString()
                    numerotres.text=nft3.toString()
                    nashe--

                }
            }


        }
        reintentar.setOnClickListener {
            reintentar.visibility=View.GONE
            button.visibility=View.VISIBLE
            nashe=3
            resultado.text=""
        }
    }
}