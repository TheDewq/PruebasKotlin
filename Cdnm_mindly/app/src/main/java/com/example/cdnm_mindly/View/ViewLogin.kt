package com.example.cdnm_mindly.View

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cdnm_mindly.R

class ViewLogin {
    @Preview
    @Composable
    fun screen(){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //titulo principal
            title()
            //imagen principal
            main_photo()
            //enunciado secundario
            secondary_text()
            //lista de acciones sugeridas, deben estar desactivadas
            ButtonCarrousel().AutoScrollingLazyRow()
            //boton de signin
            signin_button()
            //boton de login
            login_button()
            //botones de redes sociales (para login y signin)
            social_buttons()

        }
    }

    @Composable
    fun title(){
        Text(
            text = "Mindly",
            fontSize = 50.sp,

        )
    }

    @Composable
    fun main_photo(){
        Image(
            painter = painterResource(id = R.drawable.win95),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth(0.5f)
        )
    }

    @Composable
    fun secondary_text(){
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            maxLines = 3,
            modifier = Modifier
                .fillMaxWidth(0.8f)
            )
    }
    @Composable
    fun login_button(){
        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text("Iniciar sesion")
        }
    }

    @Composable
    fun signin_button(){
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Registrarse")
        }
    }

    @Composable
    fun social_buttons(){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
            }
        }
    }



    
}