package dev.filinhat.framesdk.data

import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

@JvmInline
@Serializable
value class Uuid(
    val id: String,
)
