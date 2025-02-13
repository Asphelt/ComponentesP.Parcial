package sie.iest.componentes
//Siempre se usa mayuscula al incio
//Se importan las librerias necesarias
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/////////////////////////
data class Miobjeto(
    val esGrande:Boolean,
    val saludo: String,
    val colorText:Color,
    val fontSize: TextUnit,
    val limite: Int
)
////////////////////////

//Composable sirve para crear vistas de componentes, funciones visuales
@Preview(showBackground = true)
@Composable
fun HolaMundoView(){
    val miObjeto: Miobjeto = Miobjeto(false,"Adios mundo",Color.Red,32.sp,2)
    val miobjeto2: Miobjeto = Miobjeto(false, "Adios mundo", Color.Gray,
        32.sp, 32)
    //Decarar variables y constantes
    /*
    var esGrande: Boolean = false
    val saludo:String = "Hola a todos guapisimos aquí Vegetta 777 en un nuevo en directo"
    val redColorText: Color = Color.Red
    val fontSize: TextUnit = 27.sp
    val maxLines: Int = 2
     */
    //Siempre en Texto usamo el material3 annotatedstring
    Text(text=miObjeto.saludo,
        color = miObjeto.colorText,
        fontSize = miObjeto.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        maxLines = miObjeto.limite,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        // Añade padding, background, y otras prpopiedades como css
        //modifier = Modifier.background(color= Color.Blue, shape = RoundedCornerShape(25.dp))
        modifier = Modifier
            .background(color = Color.Blue)
            .padding(16.dp)
            .background(color = Color.Cyan)
            .padding(horizontal = 16.dp)
            .background(color = Color.Gray)
            .padding(top = 6.dp)
            .background(color = Color(0xFF939D65))//Hexagesimal es 0x
            .border(width = 7.dp, color = Color.Magenta)
            //Las figuras, su alto y su ancho es conforme al contenido
            .fillMaxWidth() //ocupa todo el ancho y largo
            .blur(3.dp) // difumina el texto
            //.fillMaxWidth() ocupa todo el ancho
            //.fillMaxHeight() ocupa todo el largo
            //.width(60.dp)
    )
}