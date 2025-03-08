package sie.iest.lazylist.ViewModels

import androidx.lifecycle.ViewModel
import sie.iest.lazylist.models.ProductModel
import sie.iest.myapplication.R

class ProductViewModel (): ViewModel() {
    //init {
     //   obtenerProducto()
    //}

    fun obtenerProducto() : List<ProductModel>{
        val productoUno = ProductModel(id = 1, name = "pizza de la muerte", description = "pizzon", price = 90.0f, image = R.drawable.pizza)
        val producto2 = ProductModel(id = 2, name = "sandwich de la muerte", description = "paneson", price = 90.0f, image = R.drawable.sandwich)
        val producto3 = ProductModel(id = 3, name = "burrito de la muerte", description = "burron", price = 90.0f, image = R.drawable.burrito)
        val producto4 = ProductModel(id = 4, name = "hamburguesa de la muerte", description = "hamburguesón", price = 100.0f, image = R.drawable.pizza)
        val producto5 = ProductModel(id = 5, name = "taco de la muerte", description = "tacón", price = 80.0f, image = R.drawable.sandwich)
        val producto6 = ProductModel(id = 6, name = "hotdog de la muerte", description = "hotdogón", price = 85.0f, image = R.drawable.sandwich)
        val producto7 = ProductModel(id = 7, name = "ensalada de la muerte", description = "ensaladzón", price = 75.0f, image = R.drawable.burrito)
        val producto8 = ProductModel(id = 8, name = "sushi de la muerte", description = "sushón", price = 120.0f, image = R.drawable.pizza)
        val producto9 = ProductModel(id = 9, name = "nachos de la muerte", description = "nachón", price = 95.0f, image = R.drawable.burrito)
        val producto10 = ProductModel(id = 10, name = "pollo frito de la muerte", description = "pollón", price = 110.0f, image = R.drawable.sandwich)

        var productsList = listOf<ProductModel>(
            productoUno,producto2,producto3,producto4,producto5,producto6,producto7,producto8,producto9,producto10
        )
        return productsList
    }
}