package sie.iest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Sumas(){
    var uno by remember {
        mutableStateOf("")
    }
    var dos by remember {
        mutableStateOf("")
    }

    var suma by remember {
        mutableStateOf(0)
    }
    Column (modifier = Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Column ()
        { TextField(value = uno,modifier = Modifier.padding(5.dp), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),placeholder = { Text(text = "Escribe") },onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
                TextoIngresado ->
            uno=TextoIngresado
        })
        TextField(value = dos, modifier = Modifier.padding(5.dp),keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),placeholder = { Text(text = "Escribe") },onValueChange = {
            //Envia lo que esta enviando , texto ingresado es = a un It que apunta a la variable
                TextoIngresado ->
            dos=TextoIngresado
        })
        }
        Button(onClick = {suma = uno.toInt() + dos.toInt()} ) { Text(text = "Sumar")}
        Text(text = suma.toString())
    }
}



