package com.example.felizcumple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.felizcumple.ui.theme.FelizCumpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FelizCumpleTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    Felicitar(nombre = "Pepe", from = "Pepón")
                }
            }
        }
    }
}

@Composable
fun Felicitar(nombre: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(20.dp),
    ){
        Text(
            text = "Feliz cumpleaños, $nombre!",
            fontSize = 50.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "De parte de $from",
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.End)
        )
    }

}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FelizCumpleTheme {
        Greeting("Android")
    }
}*/
