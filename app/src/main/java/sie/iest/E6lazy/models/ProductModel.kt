package sie.iest.E6lazy.models

import android.content.ClipDescription
import androidx.annotation.DrawableRes

data class ProductArea(
    val id: Int,
    val name: String,
    val description: String?,
    val price:Float,
    @DrawableRes val image:Int
)