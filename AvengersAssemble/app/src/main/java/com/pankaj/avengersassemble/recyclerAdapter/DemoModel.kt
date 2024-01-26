package com.pankaj.avengersassemble.recyclerAdapter

import android.graphics.drawable.Drawable

data class DemoModel(
    var image: Drawable? = null
) : AbstractModel()

data class SubCatModel(
    var name: String = "ll",
    var isSelected: Boolean = false,
    var image: Drawable? = null
) : AbstractModel()

data class BookingModel(var name: String = "") : AbstractModel()



data class PastModel(var isPast: Boolean = false) : AbstractModel()