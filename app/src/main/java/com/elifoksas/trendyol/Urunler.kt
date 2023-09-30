package com.elifoksas.trendyol

import java.io.Serializable

data class Urunler(

    var urunId:Int,
    var urunResimAdi:String,
    var urunMarka:String,
    var urunAdi:String,
    var fotografliYorum:Boolean,
    var urunFiyat:Double,
    var urunRating: Int,
    var urunSatinAlanKisiSayisi : Int,
    var fenomenSecimi : Boolean,
    var kargoBedava : Boolean,
    var birlikteAlKazan : Boolean,
    var krediyeUygun : Boolean
    ) : Serializable {

}
