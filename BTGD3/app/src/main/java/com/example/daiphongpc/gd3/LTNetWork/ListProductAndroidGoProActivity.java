package com.example.daiphongpc.gd3.LTNetWork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.daiphongpc.gd3.LTNetWork.Adapter.DSSPApdater;
import com.example.daiphongpc.gd3.LTNetWork.Model.DataListAndroidGoPro;
import com.example.daiphongpc.gd3.LTNetWork.Model.ListSPAndroidGoPro;
import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.APIServices;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListProductAndroidGoProActivity extends AppCompatActivity {
    ListView lvSP;
    ArrayList<DataListAndroidGoPro> arrData = new ArrayList<>();
    DSSPApdater apdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product_android_go_pro);
        addControls();
        addEnvents();
        
    }

    private void addEnvents() {
        lvSP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ListProductAndroidGoProActivity.this,DetailSPActivity.class);
                intent.putExtra("id",arrData.get(position).productId);
                intent.putExtra("index",position);
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        lvSP = findViewById(R.id.lv_sp);
        getData();
        apdater = new DSSPApdater(arrData, this);

        lvSP.setAdapter(apdater);

    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.12:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(APIServices.class).DSSp().enqueue(new Callback<ListSPAndroidGoPro>() {
            @Override
            public void onResponse(Call<ListSPAndroidGoPro> call, Response<ListSPAndroidGoPro> response) {
                ListSPAndroidGoPro listSPAndroidGoPro = response.body();
                for (int i = 0; i < listSPAndroidGoPro.data.size(); i++) {
                    arrData.add(listSPAndroidGoPro.data.get(i));
                }
                         apdater.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<ListSPAndroidGoPro> call, Throwable t) {

            }
        });
    }
}
