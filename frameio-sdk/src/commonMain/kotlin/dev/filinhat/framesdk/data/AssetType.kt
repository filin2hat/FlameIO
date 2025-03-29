package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AssetType {
    @SerialName("document")
    Document,

    @SerialName("image")
    Image,

    @SerialName("stream")
    Stream,
}
