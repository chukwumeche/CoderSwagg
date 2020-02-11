package com.example.coderswagg.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coderswagg.R
import com.example.coderswagg.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
