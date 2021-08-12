package com.example.kotlindemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnlineClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_online_class)

        val act_join_class = findViewById<Button>(R.id.act_join_class)
        val act_join_class1 = findViewById<Button>(R.id.act_join_class1)


        act_join_class.setOnClickListener(View.OnClickListener {

           // var dial = Uri.parse("tel:123456")
            //var uri = Uri.parse("https://www.facebook.com/")
            //val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            var uri = Uri.parse("https://meet.google.com/ezd-kcub-vbu")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
        act_join_class1.setOnClickListener(View.OnClickListener {

            var uri = Uri.parse("https://meet.google.com/ezd-kcub-vbu")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        })
    }
}