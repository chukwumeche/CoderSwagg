package com.example.coderswagg.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coderswagg.Adapter.CategoryAdapter
import com.example.coderswagg.R
import com.example.coderswagg.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataServices.categories)

        categoryListView.adapter = adapter
    }
}
