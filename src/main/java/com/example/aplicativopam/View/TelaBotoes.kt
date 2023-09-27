package com.example.aplicativopam.View

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ContentAlpha.disabled
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TelaBotoes(darkMode: MutableState<Boolean>, navManager: NavController){
Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
    modifier = Modifier.fillMaxSize()
) {

    Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = { navManager.navigate("Home") }, enabled = false) {
        Text("Mi Button")
    }
    Spacer(modifier = Modifier.height(10.dp))
    OutlinedButton(onClick = { navManager.navigate("Home") }, border = BorderStroke(3.dp, Color.Blue)) {
        Text("Mi button")
    }
    Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = { navManager.navigate("Home") }) {
        Text("Mi Button")
    }
    Spacer(modifier = Modifier.height(10.dp))
    IconButton(onClick = { navManager.navigate("Home")}) {
        Icon(imageVector = Icons.Filled.Home, contentDescription = "Home")
    }
    Spacer(modifier = Modifier.height(10.dp))
    Switch(checked = false, onCheckedChange = { })
    Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = { darkMode.value = !darkMode.value }, enabled = true) {
        Text("Dark mode")
    }
}

}