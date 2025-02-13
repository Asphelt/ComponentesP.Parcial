package sie.iest.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun Columnasview(){

    //Poner una columna tiene tres parametros
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxSize()
        .background(Color.LightGray)
        ,
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(text = "Hola", color = Color.Red,
            modifier = Modifier
            .background(color = Color.Blue)
            .fillMaxWidth())

        Text(text = "Adios", color = Color.Yellow, modifier = Modifier
            .background(color = Color.Black))

        Column(
            modifier = Modifier
                .background(color = Color(0xFFE87272))
                .fillMaxSize(),
                verticalArrangement = Arrangement.Center
        ){
            Text(text = "de nuevo", color = Color.White, modifier = Modifier
                .background(color = Color(0xFFE87272)),
                textAlign = TextAlign.Center)
        }
    }
}