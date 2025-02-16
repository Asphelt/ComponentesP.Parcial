package sie.iest.compartido

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Adjust
import androidx.compose.material.icons.filled.DesktopMac
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sie.iest.myapplication.R

@Preview(showBackground = true)
@Composable
fun TerminalNumeros(){
    var firsNumber by remember {
        mutableStateOf("")
    }
    var secondNumber by remember {
        mutableStateOf("")
    }
    var suma by remember {
        mutableStateOf(0)
    }
    var resta by remember {
        mutableStateOf(0)
    }
    var multi by remember {
        mutableStateOf(0)
    }
    var divi by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "Dame un número papi")
        TextField(value = firsNumber, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,placeholder = { Text(text = "Escribe") },onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
                TextoIngresado ->
            firsNumber=TextoIngresado
        })
        Text(text = "Dame otro número papi")
        TextField(value = secondNumber, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,placeholder = { Text(text = "Escribe") },onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
                TextoIngresado ->
            secondNumber=TextoIngresado
        })

        Button(onClick = {
            suma = firsNumber.toInt() + secondNumber.toInt()
        })
        { Text(text = "Dame click papi sumaré") }
        Text(text = suma.toString())

        OutlinedButton(onClick = {
            resta = firsNumber.toInt() - secondNumber.toInt()
        }) {Text(text = "Dame click papi restare")}
        Text(text = resta.toString())

        IconButton(
            onClick = {
                multi = firsNumber.toInt() * secondNumber.toInt()
            }
        ) {
            Icon(
                imageVector = Icons.Default.Adjust,
                contentDescription = "Icono",
                tint = Color.Blue
            )
        }
        Text(text = "Dame click al icono papi multiplicare")
        Text(text = multi.toString())

        Image(
            painter = painterResource(id = R.drawable.images),
            contentDescription = "bandera",
            modifier = Modifier.size(70.dp).clickable { divi = firsNumber.toInt() / secondNumber.toInt()  },
            alpha = 0.8f
        )
        Text(text = "Dame click a la bandera papi dividire")
        Text(text = divi.toString())
    }

}
