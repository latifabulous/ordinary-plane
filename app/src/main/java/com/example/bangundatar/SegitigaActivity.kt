package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etAlas: EditText
    private lateinit var etTinggi: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        etAlas = findViewById(R.id.et_alas)
        etTinggi = findViewById(R.id.et_tinggi)

        val btnCalculate: Button = findViewById(R.id.btn_calculate)

        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputAlas = etAlas.text.toString().trim()
            val inputTinggi = etTinggi.text.toString().trim()

            var isEmptyFields = false
            when {
                inputAlas.isEmpty() -> {
                    isEmptyFields = true
                    etAlas.error = "Field ini tidak boleh kosong"
                }
                inputTinggi.isEmpty() -> {
                    isEmptyFields = true
                    etTinggi.error = "Field ini tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val luas = 1.0/2.0 * (inputAlas.toDouble() * inputTinggi.toDouble())
                tvResult.text = luas.toString()
            }
        }
    }
}