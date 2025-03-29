package dev.filinhat.framesdk.data

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Asset {
    abstract val accountId: Uuid?
    abstract val archiveFrom: Instant?
    abstract val archiveScheduledAt: Instant?
    abstract val archiveStatus: String?
    abstract val archivedAt: Instant?
    abstract val assetType: AssetType
    abstract val coverAssetId: Uuid
    abstract val creator: Creator
    abstract val frames: Int
    abstract val hardDeletedAt: Instant?
    abstract val id: Uuid
    abstract val index: Int
    abstract val isBundleChild: Boolean
    abstract val isHlsRequired: Boolean
    abstract val isSessionWatermarked: Boolean
    abstract val label: Status?
    abstract val metadata: Metadata
    abstract val metadataFlags: MetadataFlags
    abstract val name: String
    abstract val original: String
    abstract val parentAssetId: Uuid
    abstract val projectId: Uuid
    abstract val properties: Map<String, String>
    abstract val requiredTranscodes: RequiredTranscodes
    abstract val teamId: Uuid
    abstract val userPermissions: UserPermissions

    @Serializable
    enum class Status {
        @SerialName("approved")
        Approved,

        @SerialName("needs_review")
        NeedsReview,

        @SerialName("in_progress")
        InProgress,
    }

    @Serializable
    enum class Type {
        @SerialName("file")
        File,

        @SerialName("folder")
        Folder,

        @SerialName("version_stack")
        VersionStack,
    }

    @Serializable
    @SerialName("owned")
    data class File(
        @SerialName("account_id") override val accountId: Uuid?,
        @SerialName("archive_from") override val archiveFrom: Instant? = null,
        @SerialName("archive_scheduled_at") override val archiveScheduledAt: Instant? = null,
        @SerialName("archive_status") override val archiveStatus: String?,
        @SerialName("archived_at") override val archivedAt: Instant?,
        @SerialName("asset_type") override val assetType: AssetType,
        @SerialName("cover_asset_id") override val coverAssetId: Uuid,
        @SerialName("creator") override val creator: Creator,
        @SerialName("frames") override val frames: Int,
        @SerialName("hard_deleted_at") override val hardDeletedAt: Instant?,
        @SerialName("id") override val id: Uuid,
        @SerialName("index") override val index: Int,
        @SerialName("is_bundle_child") override val isBundleChild: Boolean,
        @SerialName("is_hls_required") override val isHlsRequired: Boolean,
        @SerialName("is_session_watermarked") override val isSessionWatermarked: Boolean,
        @SerialName("label") override val label: Status?,
        @SerialName("metadata") override val metadata: Metadata,
        @SerialName("metadata_flags") override val metadataFlags: MetadataFlags,
        @SerialName("name") override val name: String,
        @SerialName("original") override val original: String,
        @SerialName("parent_asset_id") override val parentAssetId: Uuid,
        @SerialName("project_id") override val projectId: Uuid,
        @SerialName("properties") override val properties: Map<String, String>,
        @SerialName("required_transcodes") override val requiredTranscodes: RequiredTranscodes,
        @SerialName("team_id") override val teamId: Uuid,
        @SerialName("user_permissions") override val userPermissions: UserPermissions,
    ) : Asset()

    @Serializable
    @SerialName("folder")
    class Folder(
        @SerialName("account_id") override val accountId: Uuid?,
        @SerialName("archive_from") override val archiveFrom: Instant? = null,
        @SerialName("archive_scheduled_at") override val archiveScheduledAt: Instant? = null,
        @SerialName("archive_status") override val archiveStatus: String?,
        @SerialName("archived_at") override val archivedAt: Instant?,
        @SerialName("asset_type") override val assetType: AssetType,
        @SerialName("cover_asset_id") override val coverAssetId: Uuid,
        @SerialName("creator") override val creator: Creator,
        @SerialName("frames") override val frames: Int,
        @SerialName("hard_deleted_at") override val hardDeletedAt: Instant?,
        @SerialName("id") override val id: Uuid,
        @SerialName("index") override val index: Int,
        @SerialName("is_bundle_child") override val isBundleChild: Boolean,
        @SerialName("is_hls_required") override val isHlsRequired: Boolean,
        @SerialName("is_session_watermarked") override val isSessionWatermarked: Boolean,
        @SerialName("item_count") val itemCount: Int,
        @SerialName("label") override val label: Status?,
        @SerialName("metadata") override val metadata: Metadata,
        @SerialName("metadata_flags") override val metadataFlags: MetadataFlags,
        @SerialName("name") override val name: String,
        @SerialName("original") override val original: String,
        @SerialName("parent_asset_id") override val parentAssetId: Uuid,
        @SerialName("project_id") override val projectId: Uuid,
        @SerialName("properties") override val properties: Map<String, String>,
        @SerialName("required_transcodes") override val requiredTranscodes: RequiredTranscodes,
        @SerialName("team_id") override val teamId: Uuid,
        @SerialName("user_permissions") override val userPermissions: UserPermissions,
    ) : Asset()

    @Serializable
    @SerialName("version_stack")
    class VersionStack(
        @SerialName("account_id") override val accountId: Uuid?,
        @SerialName("archive_from") override val archiveFrom: Instant? = null,
        @SerialName("archive_scheduled_at") override val archiveScheduledAt: Instant? = null,
        @SerialName("archive_status") override val archiveStatus: String?,
        @SerialName("archived_at") override val archivedAt: Instant?,
        @SerialName("asset_type") override val assetType: AssetType,
        @SerialName("cover_asset_id") override val coverAssetId: Uuid,
        @SerialName("creator") override val creator: Creator,
        @SerialName("frames") override val frames: Int,
        @SerialName("hard_deleted_at") override val hardDeletedAt: Instant?,
        @SerialName("id") override val id: Uuid,
        @SerialName("index") override val index: Int,
        @SerialName("is_bundle_child") override val isBundleChild: Boolean,
        @SerialName("is_hls_required") override val isHlsRequired: Boolean,
        @SerialName("item_count") val itemCount: Int,
        @SerialName("is_session_watermarked") override val isSessionWatermarked: Boolean,
        @SerialName("label") override val label: Status?,
        @SerialName("metadata") override val metadata: Metadata,
        @SerialName("metadata_flags") override val metadataFlags: MetadataFlags,
        @SerialName("name") override val name: String,
        @SerialName("original") override val original: String,
        @SerialName("parent_asset_id") override val parentAssetId: Uuid,
        @SerialName("project_id") override val projectId: Uuid,
        @SerialName("properties") override val properties: Map<String, String>,
        @SerialName("required_transcodes") override val requiredTranscodes: RequiredTranscodes,
        @SerialName("team_id") override val teamId: Uuid,
        @SerialName("user_permissions") override val userPermissions: UserPermissions,
    ) : Asset()
}
