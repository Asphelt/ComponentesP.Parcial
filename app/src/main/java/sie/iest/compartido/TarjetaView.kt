package sie.iest.compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

// Se crean parametros
@Preview(showBackground = true)
//Otra forma de mandar parametros
// fun TarjetaPreview(){
//TarjetaView(Color.Red,Color.Black)
//}
@Composable

fun TarjetasView( colorTex: Color=Color.Red, backgorund: Color=Color.Black, texto:String=""){
    Card (colors = CardDefaults.cardColors(contentColor = colorTex, containerColor = backgorund)){
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row (){
                Text(text = "BBVA")
                Text(text = "123456789")
            }
            Row (){
                Text(text = texto + "")
                Text(text = "123456789")
                Text(text = "123456789")
            }
        }
    }
}

