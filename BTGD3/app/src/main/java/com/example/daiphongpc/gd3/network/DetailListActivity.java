package com.example.daiphongpc.gd3.network;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.Adapter.DetailAdapterRetau;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailListActivity extends AppCompatActivity {
    ListView lvDetail;
    DetailAdapterRetau adapterRetau;
    ArrayList<InventoryItem> arrData;
    ArrayList<Unit> arrUnit=new ArrayList<>();
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        String names= String.valueOf(getIntent().getStringExtra("name"));
        Log.d("nameeeeeeee", "onCreate: "+names);
        addControls();
        addEvents();
    }

    private void addEvents() {
        lvDetail.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                index=position;
                Intent intent=new Intent(DetailListActivity.this,DetailDishActivity.class);
                intent.putExtra("inventory",arrData.get(position));
                intent.putExtra("arrunit",arrUnit);
                intent.putExtra("index",position);
                Log.d("dlchuagui", "onItemClick: "+arrData.get(position));
                startActivityForResult(intent,113);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==113){
            int pos=data.getIntExtra("pos",0);
            String tenmon=data.getStringExtra("tenmon");
            arrData.get(pos).setInventoryItemName(tenmon);
        }
        adapterRetau.notifyDataSetChanged();
    }

    private void addControls() {
        arrData=new ArrayList<>();
        lvDetail=findViewById(R.id.lv_detail);
        getDataList();
        adapterRetau=new DetailAdapterRetau(arrData,this);
        lvDetail.setAdapter(adapterRetau);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    private void getDataList() {
        final ProgressDialog dialog=new ProgressDialog(this);
        dialog.show();
        dialog.setCancelable(false);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://apilite.cukcuk.vn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JsonObject jsonBody=new JsonObject();
        String id=getIntent().getStringExtra("ID");
        jsonBody.addProperty("param", "{\"RestaurantTypeID\":\""+id+"\"}");
        retrofit.create(APIServices.class).getListInventoryItem(jsonBody).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Gson gson=new Gson();
                dialog.dismiss();
                ThucDon thucDon=gson.fromJson(response.body(),ThucDon.class);
                for (int i = 0; i <thucDon.listInventoryItem.size() ; i++) {
                    InventoryItem inventoryItem=thucDon.listInventoryItem.get(i);
                    arrData.add(inventoryItem);

                }
                for (int i = 0; i <thucDon.listUnit.size() ; i++) {
                    Unit unit=thucDon.listUnit.get(i);
                    arrUnit.add(unit);

                }
                adapterRetau.notifyDataSetChanged();
                Log.d("kttttttttttttt", "onResponse: "+response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}
