package view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            firstRow(modifier = Modifier.fillMaxWidth().height(100.dp))
            firstRow(modifier = Modifier.fillMaxWidth().height(100.dp))
            firstRow(modifier = Modifier.fillMaxWidth().height(100.dp))
            firstRow(modifier = Modifier.fillMaxWidth().height(100.dp))
        }
    }
}

@Composable
private fun firstRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Key(modifier = Modifier.width(100.dp).height(100.dp))
        Key(modifier = Modifier.width(100.dp).height(100.dp))
        Key(modifier = Modifier.width(100.dp).height(100.dp))
        Key(modifier = Modifier.width(100.dp).height(100.dp))
    }
}

@Composable
private fun Key(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(Color.Magenta),
    ) {

    }
}
