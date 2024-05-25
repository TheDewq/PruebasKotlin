package com.example.pruebascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pruebascompose.ui.theme.PruebasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier.){
                Image(painter = painterResource(id = R.drawable.win95), contentDescription = "foto de windows 95")
            }




        }
    }
    @Composable
    fun tarjeta(){
        Text(text = "No se pudo cabron")
    }
    
    @Preview
    @Composable
    fun preview(){


    }
}


