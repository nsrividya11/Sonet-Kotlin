package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var temp = findViewById<EditText>(R.id.temp_tv)
        var dirt = findViewById<EditText>(R.id.dirt_tv)
        var display = findViewById<TextView>(R.id.display_tv)
        var click = findViewById<Button>(R.id.btn_5)

        click.setOnClickListener(View.OnClickListener {
            var temp : Int = temp.text.toString().toInt()
            var dirt : Int = dirt.text.toString().toInt()
            display.setText(feedTheFish(temp,dirt))

        });
    }
}
fun feedTheFish(temp:Int,dirt:Int):String{
    val day = randomDay()
    val food = fishFood(day)
    var a:String = ("Today is $day and the fish eats $food ")
    var b:String = ("Change water: ${shouldChangeWater(temp,dirt)}")
    var c=a+b
    return c
}
fun fishFood(day:String):String{
    var food = ""
    when (day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}
fun randomDay():String{
    val week = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(week.size)]
}

fun shouldChangeWater(temp:Int ,dirt:Int ):Boolean{
    if(temp>30||dirt>30)
        return true;
    else
        return false;

}