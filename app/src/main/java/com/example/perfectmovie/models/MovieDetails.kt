package com.example.perfectmovie.models

import com.google.gson.annotations.SerializedName

data class MovieDetails(
        val budget: Int,
        val id: Int,
        val overview: String,
        val popularity: Double,
        @SerializedName("poster_path")
        val posterPath: String,
        @SerializedName("release_data")
        val releaseData: String,
        val revenue: Long,
        val runtime: Int,
        val status: String,
        val tagline: String,
        val title: String,
        val video: Boolean,
        @SerializedName("vote_average")
        val rating: Double
)