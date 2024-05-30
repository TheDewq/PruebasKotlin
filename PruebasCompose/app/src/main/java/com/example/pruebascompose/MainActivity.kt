package com.example.pruebascompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pruebascompose.dataclasses.Simple_task
import com.example.pruebascompose.dataclasses.simple_routine
import com.example.pruebascompose.mindlyui.new_recycler_test
import com.example.pruebascompose.ui.Login
import com.example.pruebascompose.ui.test2
import com.example.pruebascompose.ui.theme.PruebasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebasComposeTheme {
                test2().prueba2()
            }

        }
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun main_scafold(){
        Scaffold(modifier = Modifier.background(MaterialTheme.colorScheme.background)){
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()){
                item { 
                    Text(text = "alv", color = MaterialTheme.colorScheme.onBackground)
                }
            }
        }
    }



}

