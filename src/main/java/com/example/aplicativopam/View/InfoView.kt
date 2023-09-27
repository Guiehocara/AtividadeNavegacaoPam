package com.example.aplicativopam.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplicativopam.components.BotaoNormal

@Composable
fun InfoView(navManager: NavController, id: Int?, opcional: String?){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier= Modifier.fillMaxSize()
    ) {

            Row(
                horizontalArrangement = Arrangement.Center
            ) {
                Text("DetailView", fontSize = 50.sp)
            }
                Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Text("123")
            }
                Spacer(modifier = Modifier.height(10.dp))
            Row(){
                Button(
                    onClick = { navManager.navigate("Home") },
                ) {
                    Text("Retornar Home", color = Color.Black, fontSize = 20.sp)
                }
            }

    }
}