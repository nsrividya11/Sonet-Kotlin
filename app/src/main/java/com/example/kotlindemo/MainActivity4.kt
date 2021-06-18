package com.example.kotlindemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var num1 = findViewById<EditText>(R.id.n1)
        var num2 = findViewById<EditText>(R.id.n2)
        var btn = findViewById<Button>(R.id.btn_4)
        var spinner = findViewById<Spinner>(R.id.operator)
        var final = findViewById<TextView>(R.id.res)

        btn.setOnClickListener(View.OnClickListener {
            var n1 : Int = num1.text.toString().toInt()
            var n2 : Int = num2.text.toString().toInt()
            var operator:String = spinner.selectedItem.toString()
            val res : String = cal(n1, n2, operator).toString()
            final.setText("result = $res")

        })
    }
}
fun cal(n1:Int, n2:Int , op:String):Int{
     when(op){
         "+" -> return (n1+n2).toInt()
         "-" -> return (n1-n2).toInt()
         "*" -> return (n1*n2).toInt()
         "/" -> return (n1/n2).toInt()
         "%" -> return (n1%n2).toInt()
     }
return 0;
}