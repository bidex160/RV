package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dataitem = initmethod()
        val recycle = findViewById<RecyclerView>(R.id.recyclerView1)
        recycle.adapter =recycleviewadapter(this, dataitem){
            recycle.layoutManager = LinearLayoutManager(this)
            recycle.setHasFixedSize(true)
        }
    }
        fun initmethod():List<dataitem>{
        val list = ArrayList<dataitem>()
        list.add(dataitem("name",R.drawable.ic_launcher_background, "500","desc"))
        list.add(dataitem("name",R.drawable.ic_launcher_background, "500","desc"))
        list.add(dataitem("name",R.drawable.ic_launcher_background, "500","desc"))
        list.add(dataitem("name",R.drawable.ic_launcher_background, "500","desc"))


            return list

    }


}
