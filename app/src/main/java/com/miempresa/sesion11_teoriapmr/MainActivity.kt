package com.miempresa.sesion11_teoriapmr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Ejemplo de lista de imágenes
            val imageResources = listOf(
                R.drawable.perrito1,
                R.drawable.perrito2,
                R.drawable.perrito3,
                R.drawable.perrito4,
                R.drawable.perrito5,
                R.drawable.perrito6
            )
            ImageList(images = imageResources)
        }
    }
}

@Composable
fun ImageList(images: List<Int>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(images.size) { index ->
            val imageResource = images[index]
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = null,
                modifier = Modifier.fillParentMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageListPreview() {
    val imageResources = listOf(
        R.drawable.perrito1,
        R.drawable.perrito2,
        R.drawable.perrito3,
        R.drawable.perrito4,
        R.drawable.perrito5,
        R.drawable.perrito6
    )
    ImageList(images = imageResources)
}

