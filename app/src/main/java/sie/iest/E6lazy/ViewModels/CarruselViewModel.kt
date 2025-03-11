package sie.iest.E6lazy.ViewModels

import androidx.lifecycle.ViewModel
import sie.iest.E6lazy.models.ProductArea
import sie.iest.myapplication.R

class CarruselViewModel {
        fun obtenerArea() : List<ProductArea>{
            val productoUno = ProductArea(id = 1, name = "pizza de la muerte", description = "pizzon", price = 90.0f, image = R.drawable.pizza)
            val producto2 = ProductArea(id = 2, name = "sandwich de la muerte", description = "paneson", price = 90.0f, image = R.drawable.sandwich)
            val producto3 = ProductArea(id = 3, name = "burrito de la muerte", description = "burron", price = 90.0f, image = R.drawable.burrito)

            var productsList = listOf<ProductArea>(
                productoUno,producto2,producto3
            )
            return productsList
        }

}