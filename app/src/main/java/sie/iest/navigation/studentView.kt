package sie.iest.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun studentView(id:Int,name:String){
    Column { Text(text = "$name--$id") }
}