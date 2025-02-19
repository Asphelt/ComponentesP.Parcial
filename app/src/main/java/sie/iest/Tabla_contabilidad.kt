package sie.iest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.iest.myapplication.R

@Preview(showBackground = true)
@Composable
fun Tabla() {
    val I1 = 2000
    val I2 = 2000
    val I3 = 2000
    val I4 = 4000
    val I5 = 4000
    val I6 = 4000
    val I7 = 8000
    val I8 = 8000
    val I9 = 8000
    val I10 = 12000
    val I11 = 12000
    val I12 = 25000

    val E1 = 500
    val E2 = 500
    val E3 = 500
    val E4 = 4500
    val E5 = 1200
    val E6 = 3000
    val E7 = 4500
    val E8 = 4500
    val E9 = 4650
    val E10 = 6000
    val E11 = 6000
    val E12 = 75000

    var resta1 by remember { mutableStateOf("") }
    var resta2 by remember { mutableStateOf("") }
    var resta3 by remember { mutableStateOf("") }
    var resta4 by remember { mutableStateOf("") }
    var resta5 by remember { mutableStateOf("") }
    var resta6 by remember { mutableStateOf("") }
    var resta7 by remember { mutableStateOf("") }
    var resta8 by remember { mutableStateOf("") }
    var resta9 by remember { mutableStateOf("") }
    var resta10 by remember { mutableStateOf("") }
    var resta11 by remember { mutableStateOf("") }
    var resta12 by remember { mutableStateOf("") }

    var cambio by remember {
        mutableStateOf(false)
    }
    Column(modifier = Modifier.size(400.dp)) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
            Image(
                painter = painterResource(id = if (cambio) R.drawable.mexico else R.drawable.alemania),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp),
                alpha = 0.8f
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Text(text = "Contabilidad alfonso estudiante")
            }
        }
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = "", color = Color.Blue, modifier = Modifier.width(100.dp))
                Text(
                    text = "Ingresos", color = Color.White,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
                Text(
                    text = "Egresos", color = Color.White,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
                Text(
                    text = "Neto", color = Color.White,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
            }
        }
        Row(modifier = Modifier.fillMaxSize().weight(4f)) {
            Column(modifier = Modifier.fillMaxHeight().weight(1f)) {
                Text(text = "Enero", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Febrero", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Marzo", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Abril", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Mayo", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Junio", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Julio", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Agosto", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Septiembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Octubre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Noviembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
                Text(text = "Diciembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(), color = Color.White)
            }
            Column(modifier = Modifier.fillMaxSize().weight(1f)) {
                Text(text = "$I1", modifier = Modifier.fillMaxWidth(),fontWeight = if (cambio) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I2", modifier = Modifier.fillMaxWidth())
                Text(text = "$I3", modifier = Modifier.fillMaxWidth())
                Text(text = "$I4", modifier = Modifier.fillMaxWidth(),fontWeight = if (cambio) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I5", modifier = Modifier.fillMaxWidth())
                Text(text = "$I6", modifier = Modifier.fillMaxWidth())
                Text(text = "$I7", modifier = Modifier.fillMaxWidth(),fontWeight = if (cambio) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I8", modifier = Modifier.fillMaxWidth())
                Text(text = "$I9", modifier = Modifier.fillMaxWidth())
                Text(text = "$I10", modifier = Modifier.fillMaxWidth())
                Text(text = "$I11", modifier = Modifier.fillMaxWidth())
                Text(text = "$I12", modifier = Modifier.fillMaxWidth(),color = Color.Blue)
            }
            Column(modifier = Modifier.fillMaxHeight().weight(1f)) {
                Text(text = "$E1", modifier = Modifier.fillMaxWidth())
                Text(text = "$E2", modifier = Modifier.fillMaxWidth())
                Text(text = "$E3", modifier = Modifier.fillMaxWidth())
                Text(text = "$E4", modifier = Modifier.fillMaxWidth())
                Text(text = "$E5", modifier = Modifier.fillMaxWidth())
                Text(text = "$E6", modifier = Modifier.fillMaxWidth())
                Text(text = "$E7", modifier = Modifier.fillMaxWidth())
                Text(text = "$E8", modifier = Modifier.fillMaxWidth())
                Text(text = "$E9", modifier = Modifier.fillMaxWidth())
                Text(text = "$E10", modifier = Modifier.fillMaxWidth())
                Text(text = "$E11", modifier = Modifier.fillMaxWidth())
                Text(text = "$E12", modifier = Modifier.fillMaxWidth())
            }
            Column(modifier = Modifier.fillMaxHeight().weight(1f)) {
                Text(
                    text = resta1,
                    color = if (resta1.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta2,
                    color = if (resta2.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta3,
                    color = if (resta3.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta4,
                    color = if (resta4.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta5,
                    color = if (resta5.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta6,
                    color = if (resta6.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta7,
                    color = if (resta7.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta8,
                    color = if (resta8.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta9,
                    color = if (resta9.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta10,
                    color = if (resta10.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta11,
                    color = if (resta11.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta12,
                    color = if (resta12.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )

            }
        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Button(onClick = {
                    resta1 = (I1 - E1).toString()
                    resta2 = (I2 - E2).toString()
                    resta3 = (I3 - E3).toString()
                    resta4 = (I4 - E4).toString()
                    resta5 = (I5 - E5).toString()
                    resta6 = (I6 - E6).toString()
                    resta7 = (I7 - E7).toString()
                    resta8 = (I8 - E8).toString()
                    resta9 = (I9 - E9).toString()
                    resta10 = (I10 - E10).toString()
                    resta11 = (I11 - E11).toString()
                    resta12 = (I12 - E12).toString()
                    cambio = !cambio }) {
                    Text(text = "Dame click papi")
                }
            }
        }
    }
}
