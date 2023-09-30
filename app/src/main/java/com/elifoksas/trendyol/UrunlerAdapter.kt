package com.elifoksas.trendyol

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.elifoksas.trendyol.databinding.ItemTasarimBinding
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext: Context, var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.KardTasarimTutucu>(){

    inner class KardTasarimTutucu(tasarim:ItemTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:ItemTasarimBinding
        init{
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = ItemTasarimBinding.inflate(layoutInflater,parent,false)
        return KardTasarimTutucu(tasarim)

    }

    override fun onBindViewHolder(holder: KardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewUrunResim.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        t.textViewUrunAdi.text = urun.urunAdi
        t.textViewUrunFiyat.text = "${urun.urunFiyat} TL"
        t.textViewUrunMarka.text = urun.urunMarka
        t.satinAlanKisiSayisi.text = "(${urun.urunSatinAlanKisiSayisi})"


        t.fenomensecimi.visibility = if (urun.fenomenSecimi) View.VISIBLE else View.GONE
        t.kargobedava.visibility = if (urun.kargoBedava) View.VISIBLE else View.GONE
        t.krediyeuygun.visibility = if (urun.krediyeUygun) View.VISIBLE else View.GONE

        t.ratingBar.rating = urun.urunRating.toFloat()

        t.kamera.visibility = if(urun.fotografliYorum) View.VISIBLE else View.GONE


    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}