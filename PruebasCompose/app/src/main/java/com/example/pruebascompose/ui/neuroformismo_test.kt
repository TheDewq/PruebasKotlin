package com.example.pruebascompose.ui

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gandiva.neumorphic.LightSource
import com.gandiva.neumorphic.neu
import com.gandiva.neumorphic.shape.Flat
import me.nikhilchaudhari.library.neumorphic
import me.nikhilchaudhari.library.shapes.NeuShape
import me.nikhilchaudhari.library.shapes.Punched

class neuroformismo_test {

    @Composable
    fun prueba(){
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ){

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.neu(
                    Color.White,
                    Color.DarkGray,
                    lightSource = LightSource.LEFT_BOTTOM,
                    shadowElevation = 10.dp,
                    shape = Flat(defaultCornerShape)
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.onSurface
                )
            ) {
                Text(text = "Boton")
            }
        }
    }
    @Preview
    @Composable
    fun preview(){
        prueba()
    }
}