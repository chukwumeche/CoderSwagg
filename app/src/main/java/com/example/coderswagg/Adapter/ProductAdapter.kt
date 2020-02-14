package com.example.coderswagg.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswagg.R
import com.example.coderswagg.model.Product

class ProductAdapter (val context: Context, val product: List<Product>): RecyclerView.Adapter <ProductAdapter.ProductHolder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)

    }

    override fun getItemCount(): Int {
        return product.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {

        holder?.bindProduct(context, product[position])

    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productimage)
        val productName = itemView?.findViewById<TextView>(R.id.productname)
        val productPrice = itemView?.findViewById<TextView>(R.id.productprice)

        fun bindProduct (context: Context, products: Product) {

            val resourceId = context.resources.getIdentifier(products.image, "drawable", context.packageName)

            productImage?.setImageResource(resourceId)
            productName?.text = products.title
            productPrice?.text = products.price



        }


    }


}