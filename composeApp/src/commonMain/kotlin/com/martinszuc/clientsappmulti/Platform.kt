package com.martinszuc.clientsappmulti

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform