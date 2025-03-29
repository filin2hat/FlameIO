package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequiredTranscodes(
    @SerialName("cover")
    val cover: Boolean,
    @SerialName("finalized")
    val finalized: List<String>,
    @SerialName("h264_1080_best")
    val h2641080Best: Boolean,
    @SerialName("h264_2160")
    val h2642160: Boolean,
    @SerialName("h264_360")
    val h264360: Boolean,
    @SerialName("h264_540")
    val h264540: Boolean,
    @SerialName("h264_720")
    val h264720: Boolean,
    @SerialName("image_full")
    val imageFull: Boolean,
    @SerialName("image_high")
    val imageHigh: Boolean,
    @SerialName("page_proxy")
    val pageProxy: Boolean,
    @SerialName("thumb")
    val thumb: Boolean,
    @SerialName("thumb_540")
    val thumb540: Boolean,
    @SerialName("thumb_orig_ar_540")
    val thumbOrigAr540: Boolean,
    @SerialName("thumb_scrub")
    val thumbScrub: Boolean,
)
