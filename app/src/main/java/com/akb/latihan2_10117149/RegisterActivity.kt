package com.akb.latihan2_10117149

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_Register.setOnClickListener {
            val intent = Intent(this, AlmostActivity::class.java)
            startActivity(intent)
        }
    }
}
