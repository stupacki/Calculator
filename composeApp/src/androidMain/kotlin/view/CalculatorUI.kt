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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val KEY_SIZE_SMALL = 100.dp

@Composable
fun CalculatorUI() {
    MaterialTheme {
        Scaffold { padding ->
            Column(modifier = Modifier.fillMaxSize()) {
                Calculator(
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
private fun Calculator(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.DarkGray,
                        Color.Black,
                    )
                )
            )
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
            FirstRow()
            FirstRow()
            FirstRow()
            FirstRow()
        }
    }
}

@Composable
private fun FirstRow() {
    Row(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Key(modifier = Modifier.width(KEY_SIZE_SMALL).height(KEY_SIZE_SMALL))
        Key(modifier = Modifier.width(KEY_SIZE_SMALL).height(KEY_SIZE_SMALL))
        Key(modifier = Modifier.width(KEY_SIZE_SMALL).height(KEY_SIZE_SMALL))
        Key(modifier = Modifier.width(KEY_SIZE_SMALL).height(KEY_SIZE_SMALL))
    }
}

@Composable
private fun Key(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(Color.Magenta)
            .padding(8.dp),
    ) {

    }
}

@Preview
@Composable
private fun CalculatorUIPreview() {
    CalculatorUI()
}
