package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun NumberPuzzleView(){
    Column (modifier = Modifier.size(128.dp).border(BorderStroke(1.dp, Color.Black)).padding(2.dp)){
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(color = Color.Red)) {
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("1",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("2")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("3",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("4")
            }
        }
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(color = Color.Red)) {
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("5",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("6")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("7",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("8")
            }
        }
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(color = Color.Red)) {
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("9",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("10")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("11",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("12")
            }
        }
        Row (modifier = Modifier.fillMaxWidth()
            .weight(1f)
            .background(color = Color.Red)) {
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("13",color=Color.White)
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("14")
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.White)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
            }
            Column (modifier = Modifier.fillMaxHeight().weight(1f).background(color = Color.Blue)
                .border(BorderStroke(1.dp, Color.Black)), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text("15",color=Color.White)
            }
        }

    }
}