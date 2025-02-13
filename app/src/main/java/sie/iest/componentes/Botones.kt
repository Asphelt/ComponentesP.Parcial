package sie.iest.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DesktopMac
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sie.iest.myapplication.R
import androidx.compose.runtime.remember as remember1


@Preview(showBackground = true)
@Composable
fun BotonesView(){
    //var texto:String = "Abajo papi"
    var texto by remember1 {
        mutableStateOf("Adios")
    }

    //var cambio:Boolean = false

    var cambio by remember1 {
        mutableStateOf(false)
    }

    var cambio_imagen by remember1 {
        mutableStateOf(false)
    }

    Box(modifier = Modifier
        .background(Color.Yellow)
        .fillMaxSize()

    ){
        Column (modifier = Modifier.fillMaxWidth().align(Alignment.Center), verticalArrangement = Arrangement.Center){
            HorizontalDivider(color = Color.Red, modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(text = texto, color = Color.White, fontSize = 50.sp)
                Icon(imageVector = Icons.Default.DesktopMac,
                    contentDescription = "Icono",
                    tint = Color.Blue)
            }
            HorizontalDivider(color = Color.Red)
            Button(onClick = {
                if(!cambio) {
                texto = "Hola"
                } else{
                texto = "Hola nena"
                }
                cambio = !cambio } , modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.Gray
                )){
                    //Contenido
                Text(text = "Dame click papi")
            }
        }
      Icon(painter = painterResource(id = R.drawable.images), contentDescription = "Imagen", tint = Color.Unspecified
      , modifier = Modifier.align(Alignment.TopEnd))
      Text(text = texto, color = Color.White, modifier = Modifier.align(Alignment.BottomCenter) .background(color = Color.Black).fillMaxWidth(), fontSize = 50.sp, textAlign = TextAlign.Center)

    }
}