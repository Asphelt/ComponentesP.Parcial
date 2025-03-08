package sie.iest.compartido

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
fun PersonaView(navController: NavController) {
    var id by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }
    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Id")
        TextField(value = id, onValueChange = { id = it })
        Text(text = "Nombre")
        TextField(value = nombre, onValueChange = { nombre = it })

        ExtendedFloatingActionButton(
            onClick = {
                if (id.toInt() >= 11 && id.toInt() <= 100) {
                    mensaje = "Permiso autorizado por el profesor"
                } else if (id.toInt() >= 101 && id.toInt() <= 19000) {
                    mensaje = "Acceso denegado a egresados que no son de sistemas"
                } else if (id.toInt() == 22180) {
                    mensaje = "Alumno en intercambio no es posible esté presente en el I.E.ST."
                } else if (id.toInt() >= 19001 && id.toInt() <= 22210) {
                    mensaje = "Bienvenido $nombre, es un gusto verlo por aquí."
                } else if (id == "22789" || id == "22436" || id == "22969") {
                    mensaje = "Alumno $nombre autorizado para uso del laboratorio."
                } else {
                    mensaje = "Este laboratorio es de uso exclusivo para la carrera ISND"
                }
                navController.navigate("verificar/$id/$nombre/$mensaje")
            }
        ) {
            Text(text = "Validar")
        }
    }
}
