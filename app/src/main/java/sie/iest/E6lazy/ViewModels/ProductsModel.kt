package sie.iest.E6lazy.ViewModels

import androidx.lifecycle.ViewModel
import sie.iest.E6lazy.models.ProductModel
import sie.iest.myapplication.R

class ProductsModel : ViewModel() {
    fun getProducts(categoryId: Int): List<ProductModel> {
        return when (categoryId) {
            1 -> listOf(
                ProductModel(1, "Pizza", 120.0f, true, false, R.drawable.pizza),
                ProductModel(2, "Hamburguesa", 95.0f, false, true, R.drawable.burrito),
                ProductModel(3, "Sushi", 150.0f, true, true, R.drawable.burrito),
                ProductModel(4, "Tacos", 80.0f, false, false, R.drawable.burrito),
                ProductModel(5, "Hotdog", 90.0f, true, false, R.drawable.burrito),
                ProductModel(6, "Hotdog", 90.0f, true, false, R.drawable.burrito)
            )
            2 -> listOf(
                ProductModel(6, "Camisa", 300.0f, true, false, R.drawable.burrito),
                ProductModel(7, "Jeans", 500.0f, false, true, R.drawable.burrito),
                ProductModel(8, "Zapatos", 700.0f, true, false, R.drawable.burrito),
                ProductModel(9, "Sudadera", 450.0f, false, false, R.drawable.burrito),
                ProductModel(10, "Gorra", 250.0f, true, true, R.drawable.burrito)
            )
            3 -> listOf(
                ProductModel(6, "Camisa", 300.0f, true, false, R.drawable.burrito),
                ProductModel(7, "Jeans", 500.0f, false, true, R.drawable.burrito),
                ProductModel(8, "Zapatos", 700.0f, true, false, R.drawable.burrito),
                ProductModel(9, "Sudadera", 450.0f, false, false, R.drawable.burrito),
                ProductModel(10, "Gorra", 250.0f, true, true, R.drawable.burrito)
            )
            4 -> listOf(
                ProductModel(6, "Camisa", 300.0f, true, false, R.drawable.burrito),
                ProductModel(7, "Jeans", 500.0f, false, true, R.drawable.burrito),
                ProductModel(8, "Zapatos", 700.0f, true, false, R.drawable.burrito),
                ProductModel(9, "Sudadera", 450.0f, false, false, R.drawable.burrito),
                ProductModel(10, "Gorra", 250.0f, true, true, R.drawable.burrito)
            )
            5 -> listOf(
                ProductModel(6, "Camisa", 300.0f, true, false, R.drawable.burrito),
                ProductModel(7, "Jeans", 500.0f, false, true, R.drawable.burrito),
                ProductModel(8, "Zapatos", 700.0f, true, false, R.drawable.burrito),
                ProductModel(9, "Sudadera", 450.0f, false, false, R.drawable.burrito),
                ProductModel(10, "Gorra", 250.0f, true, true, R.drawable.burrito)
            )
            else -> emptyList()
        }
    }
}