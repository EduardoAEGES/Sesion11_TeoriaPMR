package com.miempresa.sesion11_teoriapmr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Ejemplo de lista de nombres
            val nombres = listOf(
                "Alice",
                "Bob",
                "Charlie",
                "David",
                "Eve",
                "Frank"
            )
            NamesList(names = nombres)
        }

    }
}

@Composable
fun NamesList(names: List<String>) {
    Column {
        names.forEach { name ->
            Text(text = name, fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    val names = listOf(
        "Alice",
        "Bob",
        "Charlie",
        "David",
        "Eve",
        "Frank"
    )

    NamesList(names = names)
}
