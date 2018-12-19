package com.example.daiphongpc.gd3.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIServices {
    //khai baos tất cả API sử dụng
    //kiểu request
    //-đường dẫn api
    //-kiểu dl trả về
    //-Tên api(class khác gọi)
    //+ dữ liệu truyền vào
    @GET("users/login")
    Call<LoginResultRequest> login(@Query("username") String username, @Query("password") String pasword);
}
