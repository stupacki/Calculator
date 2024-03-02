package view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        Scaffold { padding ->
            Column(modifier = Modifier.fillMaxSize()) {
                CalculationView(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxWidth()
                        .height(150.dp)
                )
                Keys(
                    modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                )
            }
        }
    }
}

@Composable
private fun CalculationView(
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .background(Color.Gray)
    )
}

@Composable
private fun Keys(
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .background(Color.Black)
    )
}
