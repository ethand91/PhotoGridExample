package com.example.photogalleryexample.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.photogalleryexample.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGrid(photos: List<Int>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(1),
        content = {
            items(photos.size) { index ->
                Card(modifier = Modifier.height(300.dp)) {

                    Image(
                        painter = painterResource(id = photos.get(index)),
                        contentDescription = "Photo",
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    )
}