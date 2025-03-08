package sie.iest.lazylist.Views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.iest.lazylist.ViewModels.ProductViewModel

@Preview(showBackground = true)
@Composable
fun ListProuctView(){
    val productViewModel: ProductViewModel = ProductViewModel()
    Column(modifier = Modifier.fillMaxSize()){
        LazyColumn(){
            items(productViewModel.obtenerProducto()){product ->
                ProductView(product = product)
            }
            item{
                Button(onClick = {}) {
                    Text(text = "Terminar compra")
                }
            }
        }
    }
}