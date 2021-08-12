package com.example.kotlindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class BranchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch)

        val act_cse = findViewById<TextView>(R.id.act_cse)

        act_cse.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
            val intent = Intent(this,OnlineClassActivity::class.java)
            startActivity(intent)
            finish()

        })
    }
}