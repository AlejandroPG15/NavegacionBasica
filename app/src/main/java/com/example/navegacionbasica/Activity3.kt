package com.example.navegacionbasica

import android.os.Bundle
import android.widget.TextView

class Activity3 : android.app.Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val tv1 = findViewById<TextView>(R.id.tview1)

        val contador = intent.getIntExtra("cant",0)

        tv1.setText("El edit text de la activity anterior tenía una longitud de " + contador + " caracteres")

    }

}