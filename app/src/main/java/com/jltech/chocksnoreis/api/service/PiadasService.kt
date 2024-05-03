package com.jltech.chocksnoreis.api.service

import com.jltech.chocksnoreis.api.model.response.PiadasResponse
import retrofit2.Call
import retrofit2.http.GET

interface PiadasService {

    @GET("random")
    fun getpiadas() : Call<PiadasResponse>

}