package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memePageThree : AppCompatActivity() {
    lateinit var btnBackk:Button
    lateinit var btnNexttt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page_three)
        btnBackk=findViewById(R.id.btnBackk)
        btnBackk.setOnClickListener {
            val intent=Intent(this,pageTwoMeme::class.java)
            startActivity(intent)

        }
        btnNexttt=findViewById(R.id.btnNexttt)
        btnNexttt.setOnClickListener {
            val intent=Intent(this,memePageFour::class.java)
            startActivity(intent)
        }
    }
}