package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BelahKetupatActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etD1: EditText
    private lateinit var etD2: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belah_ketupat)

        etD1 = findViewById(R.id.et_d1)
        etD2 = findViewById(R.id.et_d2)

        val btnCalculate: Button = findViewById(R.id.btn_calculate)

        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputD1 = etD1.text.toString().trim()
            val inputD2 = etD2.text.toString().trim()

            var isEmptyFields = false
            when {
                inputD1.isEmpty() -> {
                    isEmptyFields = true
                    etD1.error = "Field ini tidak boleh kosong"
                }
                inputD2.isEmpty() -> {
                    isEmptyFields = true
                    etD2.error = "Field ini tidak boleh kosong"
                }
            }

            if (!isEmptyFields) {
                val luas = 1.0/2.0 * (inputD1.toDouble() * inputD2.toDouble())
                tvResult.text = luas.toString()
            }
        }
    }
}