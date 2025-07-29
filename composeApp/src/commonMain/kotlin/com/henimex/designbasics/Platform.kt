package com.henimex.designbasics

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform