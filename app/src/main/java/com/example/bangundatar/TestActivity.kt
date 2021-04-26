package com.example.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class TestActivity : AppCompatActivity() {

    companion object {
        // menerima data dari activity asal

        const val EXTRA_RESULT = "extra_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val tvDataReceived: TextView = findViewById(R.id.tv_result2)

//        val name = intent.getStringExtra(EXTRA_NAME)
        val hasil = intent.getDoubleExtra(EXTRA_RESULT, 0.0)

        val text = """
            Hasil: $hasil
        """.trimIndent()

        tvDataReceived.text = text
    }
}