package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)

        val btnCalculate: Button = findViewById(R.id.btn_calculate)

        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val inputPanjang = etPanjang.text.toString().trim()
        val inputLebar = etLebar.text.toString().trim()

        var isEmptyFields = false
        when {
            inputPanjang.isEmpty() -> {
                isEmptyFields = true
                etPanjang.error = "Field ini tidak boleh kosong"
            }
            inputLebar.isEmpty() -> {
                isEmptyFields = true
                etLebar.error = "Field ini tidak boleh kosong"
            }
        }

        if (!isEmptyFields) {
            val luas = inputLebar.toDouble() * inputPanjang.toDouble()
            tvResult.text = luas.toString()
        }
    }
}