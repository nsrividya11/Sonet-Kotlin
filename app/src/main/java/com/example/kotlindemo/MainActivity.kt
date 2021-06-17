package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input= findViewById<EditText>(R.id.inputNum)
        var btn = findViewById<Button>(R.id.btn_3)
        var txt = findViewById<TextView>(R.id.inputNum)

        btn.setOnClickListener(android.view.View.OnClickListener {
            var radius:Double=input.text.toString().toDouble()
            val pi:Double=3.141

            var area = pi*radius*radius
            txt.setText("Result : $area")
        })
    }
}