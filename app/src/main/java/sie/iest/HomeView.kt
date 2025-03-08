package sie.iest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeView(navController: NavController){
    var id by remember { mutableStateOf("") }
    var nombre by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Bienvenido")
        Button(onClick = {navController.navigate("Lista")}) {
            Text(text = "Botones")
        }
        TextField(value = nombre, onValueChange = {nombre = it})
        TextField(value = id, onValueChange = {id = it})
        Button(onClick = {navController.navigate("estudiante?id=${id}&nombre=${nombre}")}) {
            Text(text = "A Estudiante -->")
        }
        }
    }
