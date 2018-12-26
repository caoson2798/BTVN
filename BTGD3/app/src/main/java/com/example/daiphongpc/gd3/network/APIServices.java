package com.example.daiphongpc.gd3.network;

import com.example.daiphongpc.gd3.LTNetWork.Model.GetDetailProc;
import com.example.daiphongpc.gd3.LTNetWork.Model.ListSPAndroidGoPro;
import com.example.daiphongpc.gd3.LTNetWork.Model.LoginAndroidGoPro;
import com.example.daiphongpc.gd3.network.BtRetrofit.DataShoes;
import com.example.daiphongpc.gd3.network.BtRetrofit.SanPham;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIServices {
    //http://192.168.1.9:3000/users/login?username=android003&password=123456
    //khai baos tất cả API sử dụng
    //kiểu request
    //-đường dẫn api
    //-kiểu dl trả về
    //-Tên api(class khác gọi)
    //+ dữ liệu truyền vào
    @GET("users/login")
    Call<LoginResultRequest> login(@Query("username") String username, @Query("password") String pasword);

    @GET("api/json/get/bUximwyGXm?indent=2")
    Call<DataShoes> CallDataShoes();

    @GET("api/json/get/bUczKAEzci?indent=2")
    Call<SanPham> CallDetailData();

    @POST("service/RegisterService.svc/GetListRestaurantType")
    Call<String> GetListRestaurantType();

    @POST("service/RegisterService.svc/GetListInventoryItemByRestaurantType")
    @Headers("Content-Type:application/json")
    Call<String> getListInventoryItem(@Body JsonObject jsonBody);

    @GET("users/login")
    Call<LoginAndroidGoPro> dangNhap(@Query("user_name") String username, @Query("password") String pasword);

    @POST("users/register")
    Call<LoginAndroidGoPro> dangKy(@Query("user_name") String username, @Query("password") String pasword);

    @GET("users/products")
    Call<ListSPAndroidGoPro> DSSp();

    @GET("users/detailProduct")
    Call<GetDetailProc> DetailProc(@Query("product_id") int id);
}
