package com.akb.latihan2_10117149

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var intent = intent
        val name = intent.getStringExtra("Nama")
        val blood = intent.getStringExtra("Blood")

        val hasil = findViewById<TextView>(R.id.user)
        hasil.text= name

        val hasil2 = findViewById<TextView>(R.id.btype)
        hasil2.text= "Blood Type "+blood

    }
}