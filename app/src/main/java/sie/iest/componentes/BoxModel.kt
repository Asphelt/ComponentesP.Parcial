package sie.iest.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DesktopMac
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.iest.myapplication.R

@Preview(showBackground = true)
@Composable
fun CajaView(){
    Box(modifier = Modifier
        .background(Color.Yellow)
        .size(64.dp)
    ){
        //Usar imagenes
        Image( painter = painterResource(id = R.drawable.images), contentDescription = "Fondo",
            //Poner de fondo una imagen
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.8f)
        //Alinea de varias posiciones el texto
        Text(text = "1",
            modifier = Modifier.align(Alignment.TopStart)
        )
        Text(text = "2", modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "3", modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "4", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "5", modifier = Modifier.align(Alignment.Center))
        Text(text = "6", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "7", modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "8", modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "9", modifier = Modifier.align(Alignment.BottomEnd))

        Icon(imageVector = Icons.Default.DesktopMac,
            contentDescription = "Icono",
            tint = Color.Blue
        )
    }
}