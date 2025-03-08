package sie.iest.edad

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun CalcularEdad(navController: NavController) {
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Edad")
        TextField(value = edad, onValueChange = { edad = it })
        Text(text = "Nombre")
        TextField(value = nombre, onValueChange = { nombre = it })

        ExtendedFloatingActionButton(
            onClick = {
                mensaje = when (edad.toInt()) {
                    in Int.MIN_VALUE..14 -> "Permiso autorizado por el profesor"
                    in 15..15 -> "mayor de edad en Indonesia pero no en México"
                    in 16..16 -> "mayor de edad en Cuba pero no en México"
                    in 17..17 -> "mayor de edad en Corea del Norte pero no en México"
                    in 18..18 -> "mayor de edad en México y gran parte de Latinoamérica"
                    in 19..19 -> "mayor de edad en Corea del Sur"
                    in 20..20 -> "mayor de edad en Japón"
                    in 21..21 -> "mayor de edad en USA y posiblemente en todo el mundo"
                    in 60..60-> "eres de la tercera edad"
                    in 61..61-> "Estas en la tumba"
                    else -> "Edad no reconocida"
                }
                navController.navigate("verificar/$edad/$nombre/$mensaje")
            }
        ) {
            Text(text = "Validar")
        }
    }
}