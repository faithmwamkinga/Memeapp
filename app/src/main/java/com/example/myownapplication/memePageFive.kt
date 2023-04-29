package com.example.myownapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class memePageFive : AppCompatActivity() {
    lateinit var btnBackP:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_page_five)
        btnBackP=findViewById(R.id.btnBackP)
        btnBackP.setOnClickListener {
            val  intent=Intent(this,memePageFour::class.java)
            startActivity(intent)
        }
    }
}
