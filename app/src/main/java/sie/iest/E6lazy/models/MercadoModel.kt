package sie.iest.E6lazy.models

import androidx.annotation.DrawableRes

data class MercadoModel(
    val id: Int,
    val name: String,
    @DrawableRes val image: Int
)

