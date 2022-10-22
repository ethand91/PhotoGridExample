package com.example.photogalleryexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.photogalleryexample.ui.theme.PhotoGalleryExampleTheme
import com.example.photogalleryexample.components.PhotoGrid

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotoGalleryExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val photos = listOf<Int>(
        R.drawable.pexels_photo_12284667,
        R.drawable.pexels_photo_13046458,
        R.drawable.pexels_photo_13366951,
        R.drawable.pexels_photo_13624924,
        R.drawable.pexels_photo_13675780,
        R.drawable.pexels_photo_9969158,
        R.drawable.pexels_photo_5422596,
        R.drawable.pexels_photo_13850240,
    )

    Scaffold() {
        Column(modifier = Modifier.padding(20.dp)) {
            PhotoGrid(photos = photos)
        }
    }
}