package com.example.QUIZ_DELVA.App
import com.example.QUIZ_DELVA.Model.MahasiswaModel
import com.example.QUIZ_DELVA.Model.ResponModel
import retrofit2.Call
import retrofit2.http.*
interface ApiService {
    @FormUrlEncoded
    @POST("mahasiswa/save")
    fun saveBarang(
        @Body data: MahasiswaModel,
    ):Call<ResponModel>
    @GET("mahasiswa")
    fun getMahasiswa():Call<ResponModel>
}

