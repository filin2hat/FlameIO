package dev.filinhat.frameio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform