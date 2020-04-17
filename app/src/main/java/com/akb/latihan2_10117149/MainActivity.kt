package com.akb.latihan2_10117149

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        regist.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}

/*
Tanggal Pengerjaan : 15 April 2020
Deskripsi Pengerjaan : Membuat project awal dan membuat MainActivity, RegisterActivity, AlmostActivity, VerifyActivity beserta layoutnya.

Tanggal Pengerjaan : 16 April 2020
Deskripsi Pengerjaan : Pembuatan Activity Home dan Validasi Nama & Golongan darah

Tanggal Pengerjaan : 17 April 2020
Deskripsi Pengerjaan : Menambahkan validasi checkbox Agree &  Generate APK

NIM : 10117149
NAMA : M NIZAR MIFTAHUL ULYA
KELAS : IF4
*/
