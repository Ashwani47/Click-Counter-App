package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterTxt: TextView
    private lateinit var updateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterTxt=findViewById<TextView>(R.id.counterTxt)
        updateButton=findViewById<Button>(R.id.updateButton)

        var count=0

        updateButton.setOnClickListener {
            count++
            counterTxt.text=count.toString()
        }
    }
}