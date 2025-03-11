package sie.iest.E6lazy.Views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import sie.iest.E6lazy.ViewModels.CarruselViewModel

@Preview(showBackground = true)
@Composable
fun CarruselView(){
    val CarruselViewModel: CarruselViewModel = CarruselViewModel()
    Column(modifier = Modifier.fillMaxSize()){
        LazyRow(){
            items(CarruselViewModel.obtenerArea()){product ->
                ProductView(product = product)
            }
        }
    }
}