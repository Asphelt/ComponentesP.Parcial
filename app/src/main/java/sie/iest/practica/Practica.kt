package sie.iest.practica

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Content(){
    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp) )
        Button(onClick = {}, enabled = false){
            Text(text = "Boton normal")
        }
        Spacer(modifier = Modifier.height(10.dp) )
        Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)){
            Text(text = "Boton normal 2", fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(10.dp) )
        TextButton (onClick = {}){
            Text(text = "Boton normal")
        }
        Spacer(modifier = Modifier.height(10.dp) )
        OutlinedButton (onClick = {}, border = BorderStroke(3.dp, Color.Blue )){
            Text(text = "Boton normal")
        }
        Spacer(modifier = Modifier.height(10.dp) )
        IconButton(onClick = {}) {
                Icon(Icons.Filled.DarkMode, contentDescription = "icono", tint = Color.Magenta)
        }
        Spacer(modifier = Modifier.height(10.dp) )
        var switched by remember { mutableStateOf(false) }
        Switch( checked = switched, onCheckedChange = {switched = it},
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Cyan,
                checkedTrackColor = Color.Blue,
                uncheckedThumbColor = Color.Gray,
                uncheckedTrackColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.height(10.dp) )
        FloatingActionButton(onClick = {},
            containerColor = Color.Cyan,
            contentColor = Color.White
            ) {
            Icon(Icons.Filled.Add, contentDescription = "Icon", Modifier.size(30.dp))
        }
    }
}


