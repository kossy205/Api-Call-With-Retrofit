package com.example.retrofitapicall

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// this is used to instantiate our retrofit.
// in the case where we are using dagger hilt, this instantiation would be inside our dagger-hilt module
object RetrofitInstance {

    // this is the instance of retrofit that would be used to make the api call in the
    // activity or where every needed.
    // the "by lazy" is used to ensure the "val api" variable is initialized only on its first use.
    // It helps to optimize resources by delaying the creation of the Retrofit client until it's
    // actually needed.
    val api: TodoApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TodoApi::class.java)
    }
}