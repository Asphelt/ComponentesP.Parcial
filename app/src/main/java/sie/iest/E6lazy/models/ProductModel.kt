package sie.iest.E6lazy.models

import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int,
    val name: String,
    val price: Float,
    val isFreeShipping: Boolean,
    val hasDiscount: Boolean,
    @DrawableRes val image: Int
)
