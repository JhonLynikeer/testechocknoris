package com.jltech.chocksnoreis.api.model.response





data class PiadasResponse(
    val categories: List<String>,
    val createdAt: String,
    val iconUrl: String,
    val id: String,
    val updatedAt: String,
    val url: String,
    val value: String
)