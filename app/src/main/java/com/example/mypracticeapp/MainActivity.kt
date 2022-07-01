package com.example.mypracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter : RecyclerView

        adapter = findViewById(R.id.recyclerView)

        val data = ArrayList<ItemsViewModel>()

        val customAdapter : CustomAdapter

        adapter.layoutManager = LinearLayoutManager(this);

        for (i in 1..20) {
            data.add(ItemsViewModel(com.google.android.material.R.drawable.abc_ic_arrow_drop_right_black_24dp, "Item " + i))
        }

        customAdapter = CustomAdapter(data);

        adapter.adapter = customAdapter

    }
}