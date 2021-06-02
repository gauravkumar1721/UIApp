package com.example.uiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rc: RecyclerView
    private lateinit var BrandName: ArrayList<String>
    private lateinit var TypeName: ArrayList<String>
    private lateinit var Siz: ArrayList<String>
    private lateinit var Pric: ArrayList<String>
    private lateinit var Img: ArrayList<Int>
    private lateinit var cutprice: ArrayList<Int>
    private lateinit var itemName: ArrayList<String>
    private lateinit var sizes: ArrayList<Int>
    private lateinit var percentage: ArrayList<Int>

    private lateinit var dlist: ArrayList<Data>
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rc = findViewById<RecyclerView>(R.id.recyclerView)
        rc.layoutManager = LinearLayoutManager(this)
        getData()
    }
    fun getData(){

        val BrandName = arrayOf("Royal", "BigBasket", "Batata", " CFTRI")
        val TypeName = arrayOf("Nuts", "Sugar", "Biscut", "Cashew")
        val Siz = arrayOf("500gm", "500gm", "1 pkt", "500gm")
        val Pric = arrayOf("100", "200", "300", "400")
        val cutprice = arrayOf("300", "400", "500", "600")
        val itemName = arrayOf("Nuts", "Sugar", "Biscut", "Cashew")
        val sizes = arrayOf("500gm", "500gm", "1 pkt", "500gm")
        val percentage = arrayOf("33%", "22%", "9%", "54%")
        val Img = intArrayOf(R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four)

        for(i in BrandName.indices){
            val item = Data(BrandName[i], TypeName[i], Siz[i], Pric[i],cutprice[i],Img[i])
            dlist.add(item)
        }
        rc.adapter = MyAdapter(dlist)
    }

}