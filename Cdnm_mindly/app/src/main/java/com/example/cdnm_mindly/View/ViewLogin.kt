package com.example.cdnm_mindly.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.cdnm_mindly.R

class ViewLogin {
    @Preview
    @Composable
    fun screen(){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            //titulo principal
            title()
            //imagen principal
            //main_photo()
        }
    }

    @Composable
    fun title(){
        Text(text = "Mindly")
    }

    @Composable
    fun main_photo(){
        Image(painter = painterResource(id = R.drawable.win95), contentDescription = "")
    }
    
}