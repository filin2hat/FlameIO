@file:JvmName("FrameIO")

package dev.filinhat.frameio

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import dev.filinhat.frameio.compose.FrameIOApp

fun main() =
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "FrameIO",
        ) {
            FrameIOApp()
        }
    }
