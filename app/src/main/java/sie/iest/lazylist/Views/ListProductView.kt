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
import androidx.compose.ui.unit.sp
import sie.iest.lazylist.ViewModels.ProductViewModel
import sie.iest.lazylist.ViewModels.StudentViewModel
import sie.iest.navigation.studentView

@Preview(showBackground = true)
@Composable
fun ListProuctView(){
    val productViewModel: ProductViewModel = ProductViewModel()
    val StudentViewModel:StudentViewModel = StudentViewModel()

    Column(modifier = Modifier.fillMaxSize()){
        LazyColumn(){
            item{
                Text(text = StudentViewModel.selectedStudent, fontSize = 24.sp)
            }
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