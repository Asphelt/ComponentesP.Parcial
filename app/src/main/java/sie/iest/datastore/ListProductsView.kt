package sie.iest.datastore

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListProductsView(name: String, age: Int, height: Float, initialCash: Float) {
    val productViewModel2 = ProductViewModel2()
    var showDialog by remember { mutableStateOf(false) }
    var cash by remember { mutableStateOf(initialCash) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Text("Info")
            }
        }
    ) {
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Información") },
                text = { Text("Nombre: $name, Edad: $age, Altura: $height, Dinero en Monedero: $cash") },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text("Cerrar")
                    }
                }
            )
        }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "$cash")
            LazyColumn {
                items(productViewModel2.obtenerProductos()) { product ->
                    ProductView(producto = product, cash = cash) { nuevoCash -> cash = nuevoCash }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListProductsPreview() {
    ListProductsView("", 0, 0f, 0f)
}
