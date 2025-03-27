package dev.filinhat.frameio.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.filinhat.frameio.core.uikit.FrameIOTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun FrameIOApp() {
    FrameIOTheme {
        Surface(
            Modifier
                .background(FrameIOTheme.colors.background)
                .fillMaxSize(),
        ) {
            Text(
                text = "Color test",
                color = FrameIOTheme.colors.primary,
                modifier = Modifier.padding(32.dp),
            )
        }
    }
}
