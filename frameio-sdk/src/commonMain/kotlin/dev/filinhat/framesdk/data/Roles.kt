package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Roles(
    @SerialName("admin")
    val admin: Boolean,
    @SerialName("id")
    val id: String,
    @SerialName("sales")
    val sales: Boolean,
    @SerialName("support")
    val support: Boolean,
)
