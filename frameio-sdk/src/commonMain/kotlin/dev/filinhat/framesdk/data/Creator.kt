package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Creator(
    @SerialName("account_id")
    val accountId: String,
)
