package sie.iest.myapplication
//Siempre se usa mayuscula al incio
//Se importan las librerias necesarias
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


//Composable sirve para crear vistas de componentes, funciones visuales
@Preview(showBackground = true)
@Composable
fun HolaMundoView(){
    //Siempre en Texto usamo el material3 annotatedstring
    Text(text="Hola mundo,dkmakwdakjdkwdadmakdladkwadalwkdmaldwka",
        color = Color.Red,
        fontSize = 25.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis,


        )
}
