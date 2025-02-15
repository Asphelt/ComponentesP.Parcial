package sie.iest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Posiciones(){
    Column (modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier.fillMaxWidth().weight(1f)){
            Column (modifier = Modifier.weight(1f).fillMaxHeight()) {
                Text(text = "Top start 1", modifier = Modifier.background(color = Color.Red).fillMaxWidth())
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color(0xFF5605F6)), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Top")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f))
            {
                Text(text = "Top end", modifier = Modifier.fillMaxWidth().size(70.dp).background(color = Color(0xFFAE05F6)), textAlign = TextAlign.End)
            }
        }
        Row (modifier = Modifier.fillMaxWidth().weight(2f)){
            Column (modifier = Modifier.fillMaxHeight().weight(2f)) {
                Text(text = "Center start", modifier = Modifier.fillMaxWidth().size(190.dp).background(color = Color.Green).align(alignment = Alignment.Start))
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Gray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = "Center")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(2f)) {
                Text(text = "Center End", modifier = Modifier.fillMaxWidth().background(Color.Black),Color.White, textAlign = TextAlign.End)
            }
        }
        Row (modifier = Modifier.fillMaxWidth().weight(1f)){
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Cyan), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
                Text(text = "Bottom start")
            }
            Column (modifier = Modifier.fillMaxSize().weight(2f).background(color = Color.DarkGray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
                Text(text = "Bottom Center")
            }
            Column (modifier = Modifier.fillMaxSize().weight(1f).background(color = Color.Yellow), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
                Text(text = "Bottom End")
            }
        }
    }
}
