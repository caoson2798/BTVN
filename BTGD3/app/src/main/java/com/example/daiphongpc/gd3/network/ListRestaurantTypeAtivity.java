package com.example.daiphongpc.gd3.network;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.daiphongpc.gd3.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListRestaurantTypeAtivity extends AppCompatActivity {
    ListView lvData;
    ArrayList<RetaurantType> arrDataRes=new ArrayList<>();
    com.example.daiphongpc.gd3.network.Adapter.ListAdapter adapter;
    Button btnContinue;
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_restaurant_type_ativity);
        setTitle("Chọn loại quán");
        addControls();
        addEvents();

    }

    private void addEvents() {
        lvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                RetaurantType retaurantType=arrDataRes.get(position);

                index=position;
                for (int i = 0; i <arrDataRes.size() ; i++) {
                    if (index!=i){
                        arrDataRes.get(i).setTick(false);
                    }
                }
                arrDataRes.get(position).setTick(true);
                adapter.notifyDataSetChanged();
            }
        });
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ListRestaurantTypeAtivity.this,DetailListActivity.class);

                intent.putExtra("name",arrDataRes.get(index).getRestaurantTypeName());
                intent.putExtra("ID",arrDataRes.get(index).getRestaurantTypeID());
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        btnContinue=findViewById(R.id.btn_continue);
        lvData=findViewById(R.id.lv_data);
        getData();

        adapter=new com.example.daiphongpc.gd3.network.Adapter.ListAdapter(this,arrDataRes);
        lvData.setAdapter(adapter);


    }



    private void getData() {
        final ProgressDialog dialog=new ProgressDialog(this);
        dialog.show();
        dialog.setCancelable(false);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://apilite.cukcuk.vn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(APIServices.class).GetListRestaurantType().enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                dialog.dismiss();
                Log.d("network", "onResponse: "+response.body());
                Gson gson=new Gson();
                RetaurantTypeResultRequest retaurantTypeResultRequest=gson.fromJson(response.body(),RetaurantTypeResultRequest.class);
                for (int i = 0; i <retaurantTypeResultRequest.getData().size() ; i++) {
                    RetaurantType retaurantType=retaurantTypeResultRequest.getData().get(i);
                    arrDataRes.add(retaurantType);

                }
                arrDataRes.get(0).setTick(true);
                adapter.notifyDataSetChanged();
                Log.d("mangggg", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d("loi", "onFailure: "+t.toString());
            }
        });
    }
}
