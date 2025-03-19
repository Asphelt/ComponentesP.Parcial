package sie.iest.E6lazy.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import sie.iest.E6lazy.models.ProductModel
import sie.iest.E6lazy.ViewModels.ProductsModel

@Composable
fun VistaProducto(
    categoryId: Int,
    navController: NavController,
    viewModel: ProductsModel = viewModel()
) {
    val products = viewModel.getProducts(categoryId)

    Column {
        Text(
            text = "Productos",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )
        LazyHorizontalGrid(rows = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize()) {
            itemsIndexed(products){
                index, product ->
                ProductItem(product)
        }
        }
    }
}

@Composable
fun ProductItem(product: ProductModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = product.image),
                contentDescription = product.name,
                modifier = Modifier.size(100.dp)
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = product.name)
                Text(text = "$${product.price} MXN")
                if (product.isFreeShipping) {
                    Text(text = "Envío Gratis", color = Color.Green)
                }
                if (product.hasDiscount) {
                    Text(text = "Descuento Disponible", color = Color.Red)
                }
            }
        }
    }
}
