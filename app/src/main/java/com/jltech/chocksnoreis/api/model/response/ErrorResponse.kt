package com.jltech.chocksnoreis.api.model.response

data class ErrorResponse(
    val error: String?,
    val message: String?,
    val code: Int?,
    val errors: String?
) {
    data class Error(
        val code: String?,
        val minimum: Int?,
        val type: String?,
        val inclusive: Boolean?,
        val exact: Boolean?,
        val message: String?,
        val path: List<String>?
    )

//    fun getErrorMessage(): String {
//        return errors?.joinToString { it.message ?: "" } ?: error ?: message ?: "Erro desconhecido"
//    }
}
