package sie.iest.edad
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import sie.iest.myapplication.R


@Composable

fun ValidarEdad(navController: NavController, edad: String?, nombre: String?, mensaje: String?) {
    val imagen = when (edad!!) {
        "60", "61" -> R.drawable.chavoruco
        in "15".."17" -> R.drawable.nino
        else -> R.drawable.chavo
    }

    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = imagen),
                contentDescription = "Imagen según la edad"
            )
            Text(text = "${nombre ?: "No disponible"}  ${mensaje ?: "No disponible"}")
        }
    }
}