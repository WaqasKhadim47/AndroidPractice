package com.example.mypracticeapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL ="https://jsonplaceholder.typicode.com/";
class HomeFragment : Fragment() {


lateinit var recyclerView : RecyclerView
lateinit var  adapter : PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getPosts();


    }

    private fun getPosts() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java);

      val dataResponse =  retrofitBuilder.getPosts();

        dataResponse.enqueue(object: Callback<List<UserDataItem>?>{
            override fun onResponse(
                call: Call<List<UserDataItem>?>,
                response: Response<List<UserDataItem>?>
            ) {
               val responseBody = response.body()!!;

                adapter = PostAdapter(responseBody)
                recyclerView.adapter = adapter
            }

            override fun onFailure(call: Call<List<UserDataItem>?>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.layoutManager = LinearLayoutManager(view.context);

        return view;
    }


        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }

    }
}


