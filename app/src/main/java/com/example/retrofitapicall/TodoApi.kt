package com.example.retrofitapicall

import Todo
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

// this class contains the functions to interact with our api
interface TodoApi {

    // the "/todos" is gotten from the api url. it is what comes after the ".com" of the api url
    // basically it is the specific directory where we want to fetch data from
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>



    //EXAMPLE 1
    // the endpoint "/todos" is gotten from the api url. it is what comes after the ".com" of the api url
    // basically it is the specific directory where we want to fetch data from
    // the "@Query" is used when the api requires an api key. the exact string passed to this is
    // dependent on the api documentation. it can be "apiKey" or just "key"
//    @GET("/todos")
//    fun getTodos(@Query("apiKey") apiKey: String): Response<List<Todoo>>


    //EXAMPLE 2
    //in this case we used @POST, because we are sending info to the api for it to give us a response.
    // the endpoint "/createTodo" is the specific directory from the api url to send the details to for us to get a response
    // "@Body todoo: Todoo"  is the request body and it sends the details in form of Json to the api.
    // it is sent as an object of a dataclass
    // the "CreateResponse" is the class that would be received when we send the info to the api.
    // it structures the response from the server after attempting to create a todoo
//    @POST("/createTodo")
//    fun createTodo(@Body todoo: Todoo): Response<CreateResponse>
}