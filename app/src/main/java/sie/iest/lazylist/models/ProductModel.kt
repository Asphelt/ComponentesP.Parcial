package sie.iest.lazylist.models

import android.content.ClipDescription
import androidx.annotation.DrawableRes

data class ProductModel(
    val id: Int,
    val name: String,
    val description: String?,
    val price:Float,
    @DrawableRes val image:Int
)
