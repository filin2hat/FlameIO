@file:Suppress("unused")

package dev.filinhat.framesdk.api

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query
import dev.filinhat.framesdk.data.Asset

interface AssetsApi {
    @GET("assets/{assetId}")
    suspend fun getAsset(
        @Path("assetId") assetId: String,
        @Query("include_deleted") includeDeleted: Boolean = false,
        @Query("types") types: List<Asset.Type>? = null,
    ): Asset
}
