package com.martinszuc.clients_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform