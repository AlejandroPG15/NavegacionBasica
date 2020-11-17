package com.example.navegacionbasica

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ed1 = findViewById<TextView>(R.id.ed1)
        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)

        var cant = ed1.length()

        //Parte1
        b1.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        //Parte2
        b2.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("cant", ed1.length())
            startActivity(intent)
        }

        //Parte3
        b3.setOnClickListener {
            val classes = arrayOf(Activity2::class.java,Activity3::class.java)
            val r = Random(2)

            val intent = Intent(this, classes[r.nextInt(classes.size)])
            startActivity(intent)
        }
        
    }
}