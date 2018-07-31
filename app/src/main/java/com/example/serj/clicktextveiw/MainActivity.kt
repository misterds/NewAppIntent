package com.example.serj.clicktextveiw

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "Sending  message from main Activity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//-Create  button ----------------------------------------------------------------
        val btn_click = findViewById(R.id.button_click) as Button
        btn_click.setOnClickListener {
            Toast.makeText(this,"Thist is toaste from button",Toast.LENGTH_SHORT).show()
        }

//--------------------------------------------------------------------------------
        val click_me = findViewById(R.id.ll_main_layout1) as TextView
        click_me.setOnClickListener {
            Toast.makeText(this,"You just click me",Toast.LENGTH_SHORT).show()

        }
//--------------------------------------------------------------------------------
        btnStartAnotheActivity.setOnClickListener {
            val intent = Intent(this,AnotherActivity::class.java)
            // start next activity
            startActivity(intent)
        }
//Send  message --------------------------------------------------------------------
        button_send.setOnClickListener {

            val editText= findViewById<EditText>(R.id.editText)
            val message= editText.text.toString()
            val intent = Intent(this,DisplayMessageActivity::class.java).apply{
                putExtra(EXTRA_MESSAGE,message)
            }
            startActivity(intent)

        }

    }
}
