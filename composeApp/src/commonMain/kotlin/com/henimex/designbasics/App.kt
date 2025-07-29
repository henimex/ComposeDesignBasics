package com.henimex.designbasics

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
                .padding(5.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan)
                    .border(BorderStroke(1.dp,Color.Black))
                    .padding(5.dp)
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Box(modifier = Modifier.size(80.dp).background(Color.Red))
                Box(modifier = Modifier.size(60.dp).background(Color.Green))
                Box(modifier = Modifier.size(40.dp).background(Color.Blue))
                Box(modifier = Modifier.size(60.dp).background(Color.Green))
                Box(modifier = Modifier.size(80.dp).background(Color.Red))
            }
            Spacer(modifier = Modifier.size(5.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.White)
                    .border(BorderStroke(1.dp,Color.Black))
                    .padding(5.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier.size(100.dp).background(Color.Yellow))
                Box(modifier = Modifier.size(80.dp).background(Color.Green))
                Box(modifier = Modifier.size(50.dp).background(Color.Blue))
                Box(modifier = Modifier.size(80.dp).background(Color.Green))
                Box(modifier = Modifier.size(100.dp).background(Color.Yellow))
            }
        }

//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(
//                text = "Hello World", fontSize = 50.sp
//            )
//        }
    }
}