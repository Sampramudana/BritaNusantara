package com.example.sampramudana.britanusantara.Network;

import com.example.sampramudana.britanusantara.Model.ResponseBrita;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("top-headlines?country=id&apiKey=0a3624cc60104378b8ac6bb15d4dcd78")
    Call<ResponseBrita> readNewsApi();

}
