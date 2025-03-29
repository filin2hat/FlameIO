package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetadataFlags(
    @SerialName("id")
    val id: String,
    @SerialName("is_360")
    val is360: Boolean,
    @SerialName("is_hdr")
    val isHdr: Boolean,
    @SerialName("is_original_player_compatible")
    val isOriginalPlayerCompatible: Boolean,
)
