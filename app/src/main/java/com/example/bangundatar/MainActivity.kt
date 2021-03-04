package com.example.bangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llLingkaran: LinearLayout = findViewById(R.id.ll_lingkaran)
        llLingkaran.setOnClickListener(this)

        val llSegitiga: LinearLayout = findViewById(R.id.ll_segitiga)
        llSegitiga.setOnClickListener(this)

        val llPersegi: LinearLayout = findViewById(R.id.ll_persegi)
        llPersegi.setOnClickListener(this)

        val llPersegiPanjang: LinearLayout = findViewById(R.id.ll_persegi_panjang)
        llPersegiPanjang.setOnClickListener(this)

        val llLayangLayang: LinearLayout = findViewById(R.id.ll_layang_layang)
        llLayangLayang.setOnClickListener(this)

        val llTrapesium: LinearLayout = findViewById(R.id.ll_trapesium)
        llTrapesium.setOnClickListener(this)

        val llJajarGenjang: LinearLayout = findViewById(R.id.ll_jajar_genjang)
        llJajarGenjang.setOnClickListener(this)

        val llBelahKetupat: LinearLayout = findViewById(R.id.ll_belah_ketupat)
        llBelahKetupat.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.ll_lingkaran -> {
                val lingkaranIntent = Intent(this@MainActivity, LingkaranActivity::class.java)
                startActivity(lingkaranIntent)
            }
            R.id.ll_segitiga -> {
                val segitigaIntent = Intent(this@MainActivity, SegitigaActivity::class.java)
                startActivity(segitigaIntent)
            }
            R.id.ll_persegi -> {
                val persegiIntent = Intent(this@MainActivity, PersegiActivity::class.java)
                startActivity(persegiIntent)
            }
            R.id.ll_persegi_panjang -> {
                val persegiPanjangIntent = Intent(this@MainActivity, PersegiPanjangActivity::class.java)
                startActivity(persegiPanjangIntent)
            }
            R.id.ll_layang_layang -> {
                val layangLayangIntent = Intent(this@MainActivity, LayangLayangActivity::class.java)
                startActivity(layangLayangIntent)
            }
            R.id.ll_trapesium -> {
                val trapesiumIntent = Intent(this@MainActivity, TrapesiumActivity::class.java)
                startActivity(trapesiumIntent)
            }
            R.id.ll_jajar_genjang -> {
                val jajarGenjangIntent = Intent(this@MainActivity, JajarGenjangActivity::class.java)
                startActivity(jajarGenjangIntent)
            }
            R.id.ll_belah_ketupat -> {
                val belahKetupatIntent = Intent(this@MainActivity, BelahKetupatActivity::class.java)
                startActivity(belahKetupatIntent)
            }
        }
    }
}