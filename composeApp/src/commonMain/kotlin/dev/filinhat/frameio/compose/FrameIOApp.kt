package dev.filinhat.frameio.compose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.filinhat.frameio.core.uikit.FrameIOTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun FrameIOApp() {
    FrameIOTheme {
        Text("Hello, FrameIO!")
    }
}
