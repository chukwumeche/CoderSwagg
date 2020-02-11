package com.example.coderswagg.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswagg.Adapter.CategoryRecycleAdapterre
import com.example.coderswagg.R
import com.example.coderswagg.Services.DataServices
import com.example.coderswagg.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapterre

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapterre(this, DataServices.categories) {category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adapter

        val layoutmanager = LinearLayoutManager(this)
        categoryListView.layoutManager =layoutmanager
        categoryListView.setHasFixedSize(true)
    }
}
