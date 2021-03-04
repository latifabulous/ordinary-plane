package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TrapesiumActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etSAtas: EditText
    private lateinit var etSBawah: EditText
    private lateinit var etTinggi: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trapesium)

        etSAtas = findViewById(R.id.et_sAtas)
        etSBawah = findViewById(R.id.et_sBawah)
        etTinggi = findViewById(R.id.et_tinggi)

        val btnCalculate: Button = findViewById(R.id.btn_calculate)

        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputSAtas = etSAtas.text.toString().trim()
            val inputSBawah = etSBawah.text.toString().trim()
            val inputTinggi = etTinggi.text.toString().trim()

            var isEmptyFields = false
            when {
                inputSAtas.isEmpty() -> {
                    isEmptyFields = true
                    etSAtas.error = "Field ini tidak boleh kosong"
                }
                inputSBawah.isEmpty() -> {
                    isEmptyFields = true
                    etSBawah.error = "Field ini tidak boleh kosong"
                }
                inputTinggi.isEmpty() -> {
                    isEmptyFields = true
                    etTinggi.error = "Field ini tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val luas = ((inputSAtas.toDouble() + inputSBawah.toDouble()) / 2.0 ) * inputTinggi.toDouble()
                tvResult.text = luas.toString()
            }
        }
    }
}