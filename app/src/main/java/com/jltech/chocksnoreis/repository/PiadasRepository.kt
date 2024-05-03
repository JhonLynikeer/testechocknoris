package com.jltech.chocksnoreis.repository

import com.jltech.chocksnoreis.api.ApiRequest
import com.jltech.chocksnoreis.api.service.PiadasService


class PiadasRepository() {

    private val piadasRepository = ApiRequest().getService(PiadasService::class.java)

    fun getpiadas() = piadasRepository.getpiadas()



}