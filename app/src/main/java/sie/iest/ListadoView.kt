package sie.iest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import sie.iest.compartido.TarjetasView
import sie.iest.compartido.TerminalView

@Preview (showBackground = true)
@Composable
//Llamar vistas
fun ListadoView(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        TerminalView()
        TarjetasView(Color.Blue)
        TarjetasView(colorTex = Color.Gray,texto = "hola")
        Button(onClick = {navController.popBackStack()}) { Text("volver")}
    }
}