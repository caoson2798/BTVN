package com.example.daiphongpc.gd3.network.BtRetrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.json.Product;
import com.example.daiphongpc.gd3.json.ProductAdapter;
import com.example.daiphongpc.gd3.network.APIServices;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShoseListActivity extends AppCompatActivity {
    RecyclerView rvShoes;
    ProductAdapter adapter;
    ArrayList<Product> arrData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shose_list);
        addControls();
        prepareData();
    }

    private void prepareData() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://www.json-generator.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        retrofit.create(APIServices.class).CallDataShoes().enqueue(new Callback<DataShoes>() {
            @Override
            public void onResponse(Call<DataShoes> call, Response<DataShoes> response) {
                Log.d("dlllll", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<DataShoes> call, Throwable t) {
                Log.d("loi", "onFailure: "+t.toString());
            }
        });
    }

    private void addControls() {
        rvShoes=findViewById(R.id.rv_shoes);
        adapter=new ProductAdapter(arrData,this);


    }
}
