package com.example.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class LingkaranActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etJariJari: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        etJariJari = findViewById(R.id.et_jarijari)
        val btnCalculate: Button = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
//        val luas: Double

        if (v?.id == R.id.btn_calculate) {
            val inputJariJari = etJariJari.text.toString().trim()
            val inputJariJariMod = inputJariJari.toDouble() % 7.0

//            var isEmptyFields = false
//            when {
//                inputJariJari.isEmpty() -> {
//                    isEmptyFields = true
//                    etJariJari.error = "Field ini tidak boleh kosong"
//                }
//            }
//
//            if (!isEmptyFields) {
//                val luas = (22/7) * inputJariJari.toDouble() * inputJariJari.toDouble()
//                tvResult.text = luas.toString()
//            }

            when(inputJariJariMod) {
                0.0 ->  {
                    val luas = 22.0/7.0 * (inputJariJari.toDouble() * inputJariJari.toDouble())
                    tvResult.text = luas.toString()

                    when(v?.id) {
                        R.id.btn_calculate -> {
                            val lingkaranIntent = Intent(this@LingkaranActivity, TestActivity::class.java)
                            lingkaranIntent.putExtra(TestActivity.EXTRA_RESULT, luas)
                            startActivity(lingkaranIntent)
                        }
                    }
                }
                else -> {
                    val luas = 3.14 * (inputJariJari.toDouble() * inputJariJari.toDouble())
                    tvResult.text = luas.toString()
                }
            }
        }
    }
}