package sie.iest.E6lazy.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import sie.iest.E6lazy.models.MercadoModel
import sie.iest.E6lazy.ViewModels.CategoriaModel
@Preview(showBackground = true)
@Composable
fun PreviewVistaCategorias() {
    VistaCategorias(navController = rememberNavController(), viewModel = CategoriaModel())
}

@Composable
fun VistaCategorias(navController: NavController, viewModel: CategoriaModel = viewModel()) {
    val categorias = viewModel.getCategories()

    Column {
        Text(
            text = "Categorías",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )
        LazyRow {
            items(categorias) { category ->
                CategoriaObjeto(category) {
                    navController.navigate("products/${category.id}")
                }
            }
        }
    }
}

@Composable
fun CategoriaObjeto(category: MercadoModel, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = category.image),
            contentDescription = category.name,
            modifier = Modifier.size(80.dp)
        )
        Text(text = category.name)
    }
}
