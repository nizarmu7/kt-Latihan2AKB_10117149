package com.akb.latihan2_10117149

/*
Tanggal Pengerjaan : 15,16,17 April 2020
NIM : 10117149
NAMA : M NIZAR MIFTAHUL ULYA
KELAS : IF4
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_almost.*

class AlmostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)

        var intent = intent
        val name = intent.getStringExtra("Nama")
        val blood = intent.getStringExtra("Blood")

        btn_Verify.setOnClickListener {
            val intent = Intent(this, VerifyActivity::class.java)
            intent.putExtra("Nama", name)
            intent.putExtra("Blood", blood)
            startActivity(intent)
        }
    }
}