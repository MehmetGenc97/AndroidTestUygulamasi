package com.example.hesapmakinesi

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HesapMakinesiUnitTest {
    @Test
    fun toplama_test() {
        val sayi1 = 12
        val sayi2 = 8
        val hesap = HesapMakinesi()
        val sonuc = hesap.topla(sayi1, sayi2)
        assertEquals(20, sonuc)
    }

    @Test
    fun cikarma_test() {
        val sayi1 = 12
        val sayi2 = 8
        val hesap = HesapMakinesi()
        val sonuc = hesap.cikar(sayi1, sayi2)
        assertEquals(4, sonuc)
    }

    @Test
    fun carpma_test() {
        val sayi1 = 12
        val sayi2 = 8
        val hesap = HesapMakinesi()
        val sonuc = hesap.carp(sayi1, sayi2)
        assertEquals(96, sonuc)
    }

    @Test
    fun bolme_test() {
        val sayi1 = 20
        val sayi2 = 5
        val hesap = HesapMakinesi()
        val sonuc = hesap.bol(sayi1, sayi2)
        assertEquals(4, sonuc)
    }
}