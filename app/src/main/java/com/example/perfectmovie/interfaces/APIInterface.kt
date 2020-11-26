package com.example.perfectmovie.interfaces

import com.example.perfectmovie.models.Model
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("${Api.Url}3/movie/top_rated?api_key=${Api.Key}&language=ru-US&page=1")
    fun getTop(): Call<Model>
    @GET("${Api.Url}3/movie/upcoming?api_key=${Api.Key}&language=ru-US&page=1")
    fun getUpcoming(): Call<Model>
}