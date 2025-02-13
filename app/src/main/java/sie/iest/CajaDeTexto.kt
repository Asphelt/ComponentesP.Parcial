package sie.iest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview (showBackground = true)
@Composable
fun CajaDeTexto(){

    var firsNumber by remember {
        mutableStateOf("")
    }
    var secondNumber by remember {
        mutableStateOf("")
    }
    var suma by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
        Text(text = "Dame un número papi")
        TextField(value = firsNumber, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,placeholder = { Text(text = "Escribe")},onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
            TextoIngresado ->
            firsNumber=TextoIngresado
        })
        Text(text = "Dame otro número papi")
        TextField(value = secondNumber, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) ,placeholder = { Text(text = "Escribe")},onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
                TextoIngresado ->
            secondNumber=TextoIngresado
        })

        Button(onClick = {
            suma = firsNumber.toInt() + secondNumber.toInt()
        })
        { Text(text = "Dame click papi")
        }
        Text(text = suma.toString())
    }
}