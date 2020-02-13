package com.example.coderswagg.Services

import com.example.coderswagg.model.Category
import com.example.coderswagg.model.Product

object DataServices {

    val categories = listOf(

        Category("SHIRT", "shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRT", "shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRT", "shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HAT", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(

        Product ("Devlopes Graphic Beanie", "$18", "hat1"),
        Product ("Devlopes Graphic Black", "$20", "hat2"),
        Product ("Devlopes Graphic White", "$18", "hat3"),
        Product ("Devlopes Hat Snapback", "$22", "hat4")

    )

    val hoodies = listOf(

        Product ("Devlopes Hoddie gray", "$18", "hoodie1"),
        Product ("Devlopes Hoodie Red", "$32", "hoodie2"),
        Product ("Devlopes Gray hoodie", "$18", "hoodie3"),
        Product ("Devlopes Black Hoodie", "$32", "hoodie4")


    )

    val shirt = listOf(

        Product ("Devlopes Shirt Black", "$18", "shirt1"),
        Product ("Devlopes Black badge Gray", "$20", "shirt2"),
        Product ("Devlopes Logo Shirt Red", "$18", "shirt3"),
        Product ("Devlopes Hustle", "$18", "shirt4"),
        Product ("Kickflip Studio", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProduct (Category: String): List<Product> {

        return when (Category) {
            "SHIRTS" -> shirt
            "HATS"-> hats
            "HOODIE"-> hoodies

            else -> return digitalGood


        }
    }
}