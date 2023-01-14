package com.example.compose_autoresizedtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_autoresizedtext.ui.theme.Compose_AutoResizedTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_AutoResizedTextTheme {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .background(Color.LightGray)
                    ) {
//                        Text(
//                            text = "Hello World",
//                            style = MaterialTheme.typography.h2,
//                            softWrap = false
//                        )
                        AutoResizedText(
                            text = "Hello World",
                            style = MaterialTheme.typography.h2,
                        )
                    }
                }
            }
        }
    }
}