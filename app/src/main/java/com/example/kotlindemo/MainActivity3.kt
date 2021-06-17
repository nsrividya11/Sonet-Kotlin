package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var input = findViewById<EditText>(R.id.inputNum)
        var btn = findViewById<Button>(R.id.btn_3)
        var txtv = findViewById<TextView>(R.id.txt_3)

        btn.setOnClickListener(View.OnClickListener {
         var number : Int = input.text.toString().toInt()
            var i : Int = 1
            var s : String = "";
            while(true){
                if(i==number)
                    break;
                s += "@$i";
                ++i;
            }
            txtv.setText(s)
        });
    }
}