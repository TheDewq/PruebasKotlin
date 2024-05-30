package com.example.pruebascompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class test2 {

    @Composable
    fun prueba2(){
        centerBox(Item = main())
    }
    @Composable
    fun main(){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "boton")
            }
        }
    }
    @Composable
    fun centerBox(Item:Any){
        Box (
            modifier = Modifier
                .fillMaxSize(0.7f)
                .background(color = Color.Cyan)
                .border(shape = Shape())
        ){
            Item
        }
    }
    @Preview
    @Composable
    fun preview(){
        prueba2()
    }
}