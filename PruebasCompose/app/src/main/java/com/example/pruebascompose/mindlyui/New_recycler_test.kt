package com.example.pruebascompose.mindlyui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pruebascompose.dataclasses.Simple_task
import com.example.pruebascompose.dataclasses.simple_routine

class new_recycler_test {

    @Composable
    fun main_block(simpleRoutine: simple_routine){
        Column {
            for (i in 0..24) {
                simple_hour(tiempo = i)
                /**if(simpleRoutine){
                //en este bloque se debe dibujar un bloque para la tarea correspondiente
                //simpleRoutine.routine[i].hora_inicio == i
                }else{
                //en este bloque implementara el layout para una hora sin ninguna tarea asignada
                }*/
            }
        }
    }

    @Composable
    fun simple_hour(tiempo:Int){
        Row (modifier = Modifier.height(128.dp)){
            Text(text = tiempo.toString(), modifier = Modifier.padding(top = 110.dp))
        }
    }

    @Composable
    fun simple_task(tarea: Simple_task){
        Row (){

        }
    }
}