package sie.iest

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Ajedrez(){
    Column (modifier = Modifier.size(100.dp)){
        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Black)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.White)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.White)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.Black)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Black)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.White)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.White)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.Black)}
        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Black)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.White)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.White)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.Black)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Black)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.White)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.Black).border(
                BorderStroke(1.dp, color = Color.White)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.White)}
        }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.White)) {
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h", color = Color.Black)}
            Column(modifier = Modifier.weight(1f).fillMaxHeight().background(color = Color.White).border(
                BorderStroke(1.dp, color = Color.Black)), horizontalAlignment = Alignment.CenterHorizontally) { Text(text = "h",color = Color.Black)}
        }
    }
}