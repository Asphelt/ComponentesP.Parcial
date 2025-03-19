package sie.iest.E6lazy.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.lifecycle.viewmodel.compose.viewModel
import sie.iest.E6lazy.Views.VistaCategorias
import sie.iest.E6lazy.Views.VistaProducto
import sie.iest.E6lazy.ViewModels.CategoriaModel
import sie.iest.E6lazy.ViewModels.ProductsModel

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "categories") {
        composable("categories") {
            val categoriaModel: CategoriaModel = viewModel()
            VistaCategorias(navController, categoriaModel)
        }

        composable("products/{categoryId}") { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId")?.toInt() ?: 1
            val productsModel: ProductsModel = viewModel()
            VistaProducto(categoryId, navController, productsModel)
        }
    }
}
