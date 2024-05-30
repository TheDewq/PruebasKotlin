package com.example.pruebascompose.ui

import android.annotation.SuppressLint
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class test2 {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun prueba2(){
        Scaffold() {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                centerBox()
            }
        }

    }
    @Composable
    fun centerBox(){
        Column (
            modifier = Modifier
                .fillMaxSize(0.8f)
                .background(color = MaterialTheme.colorScheme.background)
                .shadow(6.dp, shape = RoundedCornerShape(1.dp))
                .padding(top = 18.dp, start = 10.dp, end = 10.dp, bottom = 18.dp)
                ,

        ){
            val xd = Login()
            xd.AutoScrollingLazyRow()
        }
    }
    @Preview
    @Composable
    fun preview(){
        prueba2()
    }
}