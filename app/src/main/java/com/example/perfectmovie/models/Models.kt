package com.example.perfectmovie.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Model {
    @SerializedName("results")
    @Expose
    var title :List<TitleImage>? = null
}
class TitleImage{
    @SerializedName("title")
    @Expose
    var titleNews:String? = null
    @SerializedName("poster_path")
    @Expose
    var urlToImage:String? = null
    @SerializedName("vote_average")
    @Expose
    var och:String? = null
    @SerializedName("overview")
    @Expose
    var overview:String? = null
    @SerializedName("release_date")
    @Expose
    var release_date:String? = null
    @SerializedName("backdrop_path")
    @Expose
    var backpatch:String? = null
}