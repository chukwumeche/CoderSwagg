package com.example.coderswagg.controller

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswagg.Adapter.ProductAdapter
import com.example.coderswagg.R
import com.example.coderswagg.Services.DataServices
import com.example.coderswagg.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screensize = resources.configuration.screenHeightDp
        if (screensize > 720) {
            spanCount = 3
        }
        else if (screensize> 720 && orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 4
        }

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductAdapter(this, DataServices.getProduct(categoryType))

        val layoutmanger = GridLayoutManager ( this, spanCount)
        productListView.layoutManager =layoutmanger
        productListView.adapter = adapter
    }
}
