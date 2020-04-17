package com.akb.latihan2_10117149

/*
Tanggal Pengerjaan : 15,16,17 April 2020
NIM : 10117149
NAMA : M NIZAR MIFTAHUL ULYA
KELAS : IF4
*/

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    var Blood_Type: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Nama = findViewById<EditText>(R.id.usnm)
        val jenis_darah = resources.getStringArray(R.array.darah)

        val bloodt = findViewById<Spinner>(R.id.S_bloodType)
        if (bloodt != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_darah
            )
            bloodt.adapter = adapter

            bloodt.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Blood_Type = bloodt.getSelectedItem().toString();
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // kosong
                }
            }
        }


        btn_Register.setOnClickListener {
            val name = Nama.text.toString()
            var jdarah = Blood_Type.toString()

            if(name.isEmpty())
            {
                Toast.makeText(this,"Silahkan Isi Kolom Username Terlebih Dahulu", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            if(jdarah.equals("Blood Type"))
            {
                Toast.makeText(this,"Silahkan Pilih Golongan Darah Terlebih Dahulu", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }


            if(agree.isChecked())
            {
                val intent = Intent(this, AlmostActivity::class.java)
                intent.putExtra("Nama", name)
                intent.putExtra("Blood", jdarah)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Silahkan Centang Agree with Terms and Conditions Terlebih Dahulu",Toast.LENGTH_SHORT).show();
            }
        }
    }
}


