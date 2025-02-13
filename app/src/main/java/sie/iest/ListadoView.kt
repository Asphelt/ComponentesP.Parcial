package sie.iest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import sie.iest.compartido.TarjetasView
import sie.iest.compartido.TerminalView

@Preview (showBackground = true)
@Composable
//Llamar vistas
fun ListadoView(){
    Column (modifier = Modifier.fillMaxSize()){
        TerminalView()
        TarjetasView(Color.Blue)
        TarjetasView(colorTex = Color.Gray,texto = "hola")
    }
}