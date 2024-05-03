package com.jltech.chocksnoreis.api


import android.content.Context
import com.jltech.chocksnoreis.api.retrofit.RetrofitConfiguration

class ApiRequest {

    /* private var retrofit = RetrofitConfiguration().retrofit()*/

    fun <S> getService(service: Class<S>): S {
        return RetrofitConfiguration.createService(service)
    }

}