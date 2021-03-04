package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etSisi: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        etSisi = findViewById(R.id.et_sisi)
        val btnCalculate: Button = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputSisi = etSisi.text.toString().trim()

            var isEmptyFields = false

            when {
                inputSisi.isEmpty() -> {
                    isEmptyFields = true
                    etSisi.error = "Field ini tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val luas = inputSisi.toDouble() * inputSisi.toDouble()
                tvResult.text = luas.toString()
            }
        }
    }
}