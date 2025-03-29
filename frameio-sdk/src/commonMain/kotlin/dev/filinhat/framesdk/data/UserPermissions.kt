package dev.filinhat.framesdk.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserPermissions(
    @SerialName("can_download")
    val canDownload: Boolean,
    @SerialName("can_modify_template")
    val canModifyTemplate: Boolean,
    @SerialName("can_public_share_presentation")
    val canPublicSharePresentation: Boolean,
    @SerialName("can_public_share_review_link")
    val canPublicShareReviewLink: Boolean,
    @SerialName("can_share_downloadable_presentation")
    val canShareDownloadablePresentation: Boolean,
    @SerialName("can_share_downloadable_review_link")
    val canShareDownloadableReviewLink: Boolean,
    @SerialName("can_share_unwatermarked_presentation")
    val canShareUnwatermarkedPresentation: Boolean,
    @SerialName("can_share_unwatermarked_review_link")
    val canShareUnwatermarkedReviewLink: Boolean,
)
