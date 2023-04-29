package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memePageFour : AppCompatActivity() {
    lateinit var btnPrev:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page_four)
        btnPrev=findViewById(R.id.btnPrev)
        btnPrev.setOnClickListener {
            val  intent=Intent(this,memePageThree::class.java)
            startActivity(intent)
        }
       btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
       val intent=Intent(this,memePageFive::class.java)
        startActivity(intent)
        }
    }
}



