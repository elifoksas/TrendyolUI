package com.elifoksas.trendyol

import android.app.SearchableInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.elifoksas.trendyol.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding:FragmentAnasayfaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)


        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"macbook","Apple","Macbook Air 13'' M1 ",true,24.344,5,2604,
            fenomenSecimi = true,
            kargoBedava = true,
            birlikteAlKazan = false,
            krediyeUygun = true
        )
        val u2 = Urunler(2,"laptop","Huawei","Matebook 14 ",false,9877.775,4, 209,
            fenomenSecimi = true,
            kargoBedava = false,
            birlikteAlKazan = false,
            krediyeUygun = true)
        val u3 = Urunler(3,"lenovo","Lenovo","Ideapad1 Intel Celeron",false,6.389,3, 172,
            fenomenSecimi = false,
            kargoBedava = true,
            birlikteAlKazan = false,
            krediyeUygun = true)
        val u4 = Urunler(4,"monster","Monster","Abra A5 V16.8",true,22.498,5, 1234,
            fenomenSecimi = true,
            kargoBedava = true,
            birlikteAlKazan = false,
            krediyeUygun = true)
        val u5 = Urunler(5,"asus","Asus","X515ja-br2006t-p",true,9.499,2, 120,
            fenomenSecimi = false,
            kargoBedava = false,
            birlikteAlKazan = false,
            krediyeUygun = true)

        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)

        binding.searchView.queryHint = "bilgisayar"

        binding.rv.adapter = adapter
        return binding.root

    }

}