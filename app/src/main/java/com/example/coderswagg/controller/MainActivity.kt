package com.example.coderswagg.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswagg.Adapter.CategoryRecycleAdapterre
import com.example.coderswagg.R
import com.example.coderswagg.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapterre

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapterre(this, DataServices.categories)

        categoryListView.adapter = adapter

        val layoutmanager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutmanager
        categoryListView.setHasFixedSize(true)
    }
}
