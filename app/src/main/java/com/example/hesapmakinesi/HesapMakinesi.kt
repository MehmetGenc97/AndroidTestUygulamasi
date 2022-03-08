package com.example.hesapmakinesi

class HesapMakinesi {
    fun topla(gelenSayi1: Int, gelenSayi2: Int) : Int {
        return gelenSayi1 + gelenSayi2
    }

    fun carp(gelenSayi1: Int, gelenSayi2: Int) : Int {
        return gelenSayi1 * gelenSayi2
    }

    fun cikar(gelenSayi1: Int, gelenSayi2: Int) : Int {
        return gelenSayi1 - gelenSayi2
    }

    fun bol(gelenSayi1: Int, gelenSayi2: Int) : Int {
        return gelenSayi1 / gelenSayi2
    }
}