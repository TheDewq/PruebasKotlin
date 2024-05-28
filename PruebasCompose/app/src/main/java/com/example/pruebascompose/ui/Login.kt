package com.example.pruebascompose.ui

import android.content.res.Configuration
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pruebascompose.ui.theme.colors

class Login {
    val backgroundGradient:List<Color> = listOf(colors.convert("#00b4fc"), colors.convert("#005bc5"), colors.convert("#001449"))

    @Composable
    fun screen(){
        val screen_w = LocalConfiguration.current.screenWidthDp
        val screen_h = LocalConfiguration.current.screenHeightDp

        val infiniteTransition = rememberInfiniteTransition()
        val offset by infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(tween(1000, easing = LinearEasing))
        )
        Box (
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Brush.linearGradient(backgroundGradient, start = Offset(offset,offset)))
        ){
            Text(text = "Carajo")
        }
    }

    @Preview
    @Composable
    fun preview_login(){
        screen()
    }
}