package com.example.myownapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pageTwoMeme : AppCompatActivity() {
    lateinit var btnBack1:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two_meme)
        btnBack1=findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
        val intent=Intent( this,MainActivity::class.java)
        startActivity(intent)
        }
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent=Intent(this,memePageThree::class.java)
            startActivity(intent)}
    }
}


//class MainActivity : AppCompatActivity() {
//    lateinit var btnNext:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        btnNext = findViewById(R.id.btnNext)
//        btnNext.setOnClickListener {
//        val intent=Intent(this,pageTwoMeme::class.java)
//            startActivity(intent)
//        }
//    }
//}