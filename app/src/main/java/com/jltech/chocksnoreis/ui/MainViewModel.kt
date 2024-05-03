package com.jltech.chocksnoreis.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jltech.chocksnoreis.api.model.response.PiadasResponse
import com.jltech.chocksnoreis.repository.PiadasRepository
import com.jltech.chocksnoreis.utils.ResponseParser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {


    val piadasRepository = PiadasRepository()

    val success = MutableLiveData<PiadasResponse>()
    val error = MutableLiveData<String>()


    fun getPiadas(){
        piadasRepository.getpiadas().enqueue(object : Callback<PiadasResponse> {
            override fun onResponse(
                call: Call<PiadasResponse>,
                response: Response<PiadasResponse>
            ) {
                if(response.isSuccessful){
                    success.postValue(response.body())
                } else {
                    error.postValue(ResponseParser.parseError(response))
                }
            }

            override fun onFailure(call: Call<PiadasResponse>, t: Throwable) {
                error.postValue(t.message)
            }

        })
    }

}