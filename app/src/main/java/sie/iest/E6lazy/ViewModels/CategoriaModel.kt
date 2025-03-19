package sie.iest.E6lazy.ViewModels
import androidx.lifecycle.ViewModel
import sie.iest.E6lazy.models.MercadoModel
import sie.iest.myapplication.R

class CategoriaModel : ViewModel() {
    fun getCategories(): List<MercadoModel> {
        return listOf(
            MercadoModel(1, "Comida", R.drawable.sandwich),
            MercadoModel(2, "Electrónicos", R.drawable.compu),
            MercadoModel(3, "Ropa", R.drawable.ropa),
            MercadoModel(4, "Hogar", R.drawable.cocina),
            MercadoModel(5, "Juguetes", R.drawable.juguete)
        )
    }
}

