package com.example.individual3q1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.individual3q1.ui.theme.Individual3q1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Individual3q1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Row(Modifier.padding(innerPadding)
                        .fillMaxSize()) {
                        Box(Modifier.weight(1f)
                            .background(Color.LightGray)
                            .fillMaxHeight()) {
                            Text("25%")
                        }
                        Box(Modifier.weight(3f)
                            .background(Color.Green)
                            .fillMaxHeight()){
                            Column{
                                Box(Modifier.weight(2f)
                                    .border(1.dp, Color.Black)
                                    .fillMaxWidth()){
                                    Text("2")
                                }
                                Box(Modifier.weight(3f)
                                    .border(1.dp, Color.Black)
                                    .fillMaxWidth()){
                                    Text("3")
                                }
                                Box(Modifier.weight(5f)
                                    .border(1.dp, Color.Black)
                                    .fillMaxWidth()){
                                    Text("5")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Individual3q1Theme {
        Greeting("Android")
    }
}