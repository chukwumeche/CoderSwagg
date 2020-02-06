package com.example.coderswagg.Services

import com.example.coderswagg.model.Category
import com.example.coderswagg.model.Product

object DataServices {

    val category = listOf(

        Category("SHIRT", "ShirtImage"),
        Category("HOODIE","HoodieImage"),
        Category("HAT", " HatImage"),
        Category("DIGITAL", "DigitalgoodImage")
    )

    val hats = listOf(

        Product ("Devlopes Graphic Beanie", "$18", "hat01"),
        Product ("Devlopes Graphic Black", "$20", "hat02"),
        Product ("Devlopes Graphic White", "$18", "hat03"),
        Product ("Devlopes Hat Snapback", "$22", "hat04")

    )

    val hoodie = listOf(

        Product ("Devlopes Hoddie gray", "$18", "hoodie01"),
        Product ("Devlopes Hoodie Red", "$32", "hoodie02"),
        Product ("Devlopes Gray hoodie", "$18", "hoodie03"),
        Product ("Devlopes Black Hoodie", "$32", "hoodie04")


    )

    val shirt = listOf(

        Product ("Devlopes Shirt Black", "$18", "shirt01"),
        Product ("Devlopes Black badge Gray", "$20", "shirt02"),
        Product ("Devlopes Logo Shirt Red", "$18", "shirt03"),
        Product ("Devlopes Hustle", "$18", "shirt04"),
        Product ("Kickflip Studio", "$18", "shirt05")
    )
}