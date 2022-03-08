package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val hesap = HesapMakinesi()

        tasarim.buttonTopla.setOnClickListener {
            val sayi1 = tasarim.editTextSayi1.text.toString().toInt()
            val sayi2 = tasarim.editTextSayi2.text.toString().toInt()
            tasarim.textViewSonuc.text = hesap.topla(sayi1, sayi2).toString()
        }

        tasarim.buttonCarp.setOnClickListener {
            val sayi1 = tasarim.editTextSayi1.text.toString().toInt()
            val sayi2 = tasarim.editTextSayi2.text.toString().toInt()
            tasarim.textViewSonuc.text = hesap.carp(sayi1, sayi2).toString()
        }

        tasarim.buttonCikar.setOnClickListener {
            val sayi1 = tasarim.editTextSayi1.text.toString().toInt()
            val sayi2 = tasarim.editTextSayi2.text.toString().toInt()
            tasarim.textViewSonuc.text = hesap.cikar(sayi1, sayi2).toString()
        }

        tasarim.buttonBol.setOnClickListener {
            val sayi1 = tasarim.editTextSayi1.text.toString().toInt()
            val sayi2 = tasarim.editTextSayi2.text.toString().toInt()
            tasarim.textViewSonuc.text = hesap.bol(sayi1, sayi2).toString()
        }

    }
}