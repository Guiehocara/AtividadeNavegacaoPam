package com.example.aplicativopam.components


import android.widget.EditText
import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color



@Composable
fun BotaoNormal(color: Color, texto: String, click: () -> Unit){
    TextButton(
        onClick = { },
        modifier = Modifier.background(color = Color.Red)
    ) {
        Text(texto)
    }
}

@Composable
fun Input(){
    var texto by remember {
        mutableStateOf("")
    }
    TextField(value = texto, onValueChange = {texto = it})
}