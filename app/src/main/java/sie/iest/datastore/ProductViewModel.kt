package sie.iest.datastore

import androidx.lifecycle.ViewModel
import sie.iest.myapplication.R

class ProductViewModel2 : ViewModel() {
    fun obtenerProductos(): List<ProductModel2> {
        return listOf(
            ProductModel2(1, "Sandwich", "1 sub bien mamalon", 90.0f, R.drawable.sandwich),
            ProductModel2(2, "Burrito", "Un burron bien grande aiññ", 70.0f, R.drawable.burrito),
            ProductModel2(3, "Hamburguesa", "Parece subway", 500.0f, R.drawable.sandwich),
            ProductModel2(4, "Pizza", "Liru sisa", 99.0f, R.drawable.pizza),
            ProductModel2(5, "Sandwich", "1 sub bien mamalon", 120.0f, R.drawable.sandwich),
            ProductModel2(6, "Burrito", "Burron burrito", 90.0f, R.drawable.burrito),
            ProductModel2(7, "Hamburguesa", "Parece sub y que", 500.0f, R.drawable.sandwich),
            ProductModel2(8, "Pizza", "liru pizza", 99.0f, R.drawable.pizza)
        )
    }
}
