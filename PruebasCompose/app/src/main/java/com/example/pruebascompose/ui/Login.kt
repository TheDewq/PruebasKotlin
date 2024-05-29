package com.example.pruebascompose.ui

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.widget.Space
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pruebascompose.R
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
                .background(
                    Brush.linearGradient(
                        backgroundGradient,
                        start = Offset(offset, offset)
                    )
                )
                .padding(all = 10.dp)
        ){
            Column {
                Text(text = "Carajo", fontSize = 40.sp, fontFamily = FontFamily.Serif);
                ElevatedButton(
                    onClick = { println("sirve esta cosa") },

                ) {
                    Text(text = "boton")
                }
            }

        }
    }
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun scafold(){
        Scaffold (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            topBar = { TopAppBar(title = { Text(text = "alv")}) },
            bottomBar = {
                BottomAppBar {
                    NavigationBar {
                        NavigationBarItem(
                            selected = true,
                            onClick = {
                                      println("hola mi vida")
                                      },
                            icon = {
                                Icon(painter = painterResource(id = R.drawable.win95), contentDescription = "", modifier = Modifier.size(10.dp))
                            },
                            label = {
                                Text(text = "seccion 1")
                            }
                        )
                    }
                }
            }

        ){

        }
    }



    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ejemplo_scafold(){


            var presses by remember { mutableIntStateOf(0) }

            Scaffold(
                //attr of scaffold

                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                topBar = {
                    TopAppBar(
                        colors = topAppBarColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            titleContentColor = MaterialTheme.colorScheme.primary,
                        ),
                        title = {
                            Text("Top app bar")
                        },
                        scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
                    )

                },
                bottomBar = {
                    BottomAppBar(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        contentColor = MaterialTheme.colorScheme.primary,
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "Bottom app bar",
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { presses++ }) {
                        Icon(Icons.Default.Add, contentDescription = "Add")
                    }
                }
            ) { innerPadding ->
                LazyColumn(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),

                ) {
                    item{
                        LazyRow {
                            for (i in 0..5){
                                item{
                                    ElevatedButton(
                                        onClick = { /*TODO*/ },
                                        modifier = Modifier.
                                    ) {
                                        Text(text = "boton")
                                    }
                                    Spacer(modifier = Modifier.size(10.dp))
                                }
                            }
                        }
                        LaunchedEffect(Unit) {
                            autoScroll(lazyListState)
                        }
                    }
                    for (i in 1..100) {
                        item {
                            Text(text = i.toString())
                        }
                    }



                }
            }

    }


    @Preview
    @Composable
    fun preview_login(){
        ejemplo_scafold()
    }


    }
