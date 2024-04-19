package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    app()
                }
            }
        }
    }
}

@Composable
fun app() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        var imagen by remember {
            mutableStateOf(1)
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7F)
                .padding(top = 20.dp)
        ) {
            Box (
                modifier = Modifier
                    .width(365.dp)
                    .fillMaxHeight(0.87F)
                    .align(Alignment.Center)
                    .shadow(4.dp)
                    .padding(25.dp)
            ) {
                Column (
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    when (imagen) {
                        1 -> Image(
                            painter = painterResource(id = R.drawable.imagen1),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                        2 -> Image(
                            painter = painterResource(id = R.drawable.imagen2),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                        3 -> Image(
                            painter = painterResource(id = R.drawable.imagen3),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.7F)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .width(365.dp)
                    .wrapContentHeight()
                    .background(Color(0X110000AA))
                    .padding(12.dp)
            ) {
                when (imagen) {
                    1-> Text(
                        text = "Fondo de neón relación 4-3",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    2 -> Text(
                        text = "Fondo retro de neón y sol",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                    3 -> Text(
                        text = "Oscuridad y lluvia en la carretera",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
                Row {
                    when (imagen) {
                        1 -> {Text(
                                text = "AmazingWeb 0.1",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                modifier = Modifier.padding(end = 4.dp)
                            )
                            Text(
                                color = Color.Black,
                                text = "("
                            )
                            Text(
                                color = Color.Black,
                                text = "2012",
                                fontStyle = FontStyle.Italic
                            )
                            Text(
                                color = Color.Black,
                                text = ")"
                            )
                        }
                        2 -> {Text(
                            text = "RetroA1",
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(end = 4.dp)
                        )
                            Text(
                                color = Color.Black,
                                text = "("
                            )
                            Text(
                                color = Color.Black,
                                text = "2015",
                                fontStyle = FontStyle.Italic
                            )
                            Text(
                                color = Color.Black,
                                text = ")"
                            )
                        }
                        3 -> {Text(
                            text = "NightColor",
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            modifier = Modifier.padding(end = 4.dp)
                        )
                            Text(
                                color = Color.Black,
                                text = "("
                            )
                            Text(
                                color = Color.Black,
                                text = "2014",
                                fontStyle = FontStyle.Italic
                            )
                            Text(
                                color = Color.Black,
                                text = ")"
                            )
                        }
                    }
                }
            }
        }
        Row (
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1F)
                .padding(start = 25.dp, end = 25.dp)
        ) {
            Button(
                onClick = {
                    if(imagen>1) {
                        imagen--
                    }
                },
                Modifier.wrapContentHeight()
            ) {
                Text(
                    text = "Anterior"
                )
            }
            Button(
                onClick = {
                    if(imagen<3) {
                        imagen++
                    }
                }
            ) {
                Text(
                    text = "Siguiente"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        app()
    }
}