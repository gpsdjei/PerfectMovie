package com.example.perfectmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.perfectmovie.interfaces.APIInterface
import com.example.perfectmovie.interfaces.Api
import com.example.perfectmovie.models.Model
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

//    private fun apiConnect() {
//        val builder = Retrofit.Builder()
//                .baseUrl(Api.Url)
//                .addConverterFactory(GsonConverterFactory.create())
//        val retrofit = builder.build()
//        val apiInterface: APIInterface = retrofit.create<APIInterface>(APIInterface::class.java)
//        val Call: retrofit2.Call<Model> = apiInterface.getTop()
//        Call.enqueue(object : Callback<Model> {
//            override fun onFailure(call: retrofit2.Call<Model?>, t: Throwable) {}
//            override fun onResponse(call: Call<Model>, response: Response<Model>) {
//                text.text = response.body()!!.title!![0].titleNews.toString()
//            }
//        })
//    }
}