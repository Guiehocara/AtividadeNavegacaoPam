package com.example.aplicativopam.View

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplicativopam.components.BotaoNormal
import com.example.aplicativopam.components.Input
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun HomeView(navManager: NavController){
    Surface(Modifier.background(Color.White)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {
            Row {
                Text("HomeView", fontSize = 50.sp)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Input()
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(){
                Button(
                    onClick = { navManager.navigate("Detail/1/'ola'") },

                ) {
                    Text("DetailView", color = Color.Black, fontSize = 20.sp)
                }

        }
            Spacer(modifier = Modifier.height(10.dp))
            Row(){
                Button(
                    onClick = { navManager.navigate("Botoes") },

                ) {
                    Text("Tela de Botoes", color = Color.Black, fontSize = 20.sp )
                }
            }


        }
    }
}