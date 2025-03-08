package sie.iest.lazylist.Views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.iest.lazylist.models.ProductModel
import sie.iest.myapplication.R

@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val product = ProductModel(
        id=1,
        name = "Sandwich de la muerte",
        description = null,
        price = 90.0f,
        image = R.drawable.sandwich
    )
    ProductView(product)
}

@Composable
fun ProductView(product:ProductModel){
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painterResource(id= product.image), contentDescription = "", modifier = Modifier.size(100.dp), contentScale = ContentScale.Crop)
            Column(modifier = Modifier.fillMaxWidth().padding(start = 6.dp), Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = product.name, fontSize = 18.sp)
                Text(text = product.description ?: "", fontSize = 10.sp, color = Color.Black)
                Text(text = "${product.price}MX", color = Color(0xFF189823), fontSize = 15.sp)
                Box(){
                    Button(onClick = {}) { Text(text = "Comprar")}
                }
            }
        }
    }

}