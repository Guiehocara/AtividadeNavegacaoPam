package com.example.aplicativopam.navigation

import android.util.MutableBoolean
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.aplicativopam.View.HomeView
import com.example.aplicativopam.View.InfoView
import com.example.aplicativopam.View.TelaBotoes

@Composable
fun Navigation(darkMode: MutableState<Boolean>){
 var navManager = rememberNavController()
 NavHost(navController = navManager, startDestination = "Home" ){
    composable("Home"){
      HomeView(navManager)
    }
     composable("Botoes"){
         TelaBotoes(darkMode, navManager)
     }
    composable("Detail/{id}/{opcional}",
     arguments = listOf(
      navArgument("id"){type = NavType.IntType},
      navArgument("opcional"){type = NavType.StringType},
     )
    ){
     var id = it.arguments?.getInt("id")
     var opcional = it.arguments?.getString("opcional")
      InfoView(navManager, id, opcional)
    }

 }
}