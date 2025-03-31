package sie.iest.datastore

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.iest.myapplication.R

@Composable
fun ProductView(producto: ProductModel2, cash: Float, actualizarCash: (Float) -> Unit) {
    val context = LocalContext.current

    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = producto.image),
                contentDescription = producto.description,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = producto.name, fontSize = 18.sp)
                Text(
                    text = producto.description ?: "Sin descripción",
                    fontSize = 10.sp,
                    color = Color.Blue
                )
                Text(text = "${producto.price} MXN")

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Button(onClick = {
                        if (cash >= producto.price) {
                            actualizarCash(cash - producto.price)
                        } else {
                            Toast.makeText(context, "No tienes suficiente dinero", Toast.LENGTH_SHORT).show()
                        }
                    }) {
                        Text("Comprar")
                    }
                }
            }
        }
    }
}
