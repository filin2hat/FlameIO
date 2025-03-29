package dev.filinhat.framesdk

import de.jensklingenberg.ktorfit.Ktorfit
import dev.filinhat.framesdk.api.AssetsApi
import dev.filinhat.framesdk.data.DeveloperToken
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.DefaultJson
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

class FrameClient internal constructor(
    private val baseUrl: String,
    private val httpClient: HttpClient,
) {
    private val ktorfit by lazy {
        Ktorfit
            .Builder()
            .httpClient(httpClient)
            .baseUrl(baseUrl)
            .build()
    }

    @Suppress("DEPRECATION")
    val assets by lazy { ktorfit.create<AssetsApi>() }
}

fun FrameClient(
    baseUrl: String = "https://api.frame.io/v2/",
    json: Json = DefaultJson,
    developerToken: DeveloperToken,
): FrameClient {
    val httpClient =
        defaultHttpClient {
            install(Auth) {
                bearer {
                    loadTokens {
                        BearerTokens(accessToken = developerToken.token, refreshToken = null)
                    }
                }
            }
            install(ContentNegotiation) {
                json(json)
            }
        }

    return FrameClient(baseUrl, httpClient)
}

private fun defaultHttpClient(
    json: Json = DefaultJson,
    block: HttpClientConfig<*>.() -> Unit = {},
): HttpClient =
    HttpClient {
        install(ContentNegotiation) {
            json(json)
        }

        block()
    }
