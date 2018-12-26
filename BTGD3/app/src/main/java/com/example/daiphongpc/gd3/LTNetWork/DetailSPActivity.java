package com.example.daiphongpc.gd3.LTNetWork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daiphongpc.gd3.LTNetWork.Model.ArrayDetailProc;
import com.example.daiphongpc.gd3.LTNetWork.Model.GetDetailProc;
import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.APIServices;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailSPActivity extends AppCompatActivity {
    ImageView imgPro;
    TextView txtNameProc, txtPrice, txtId, txtTonKho, txtDecrip;
    ArrayList<ArrayDetailProc> arrData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sp);
        addControls();
        getData();
    }

    private void addControls() {
        imgPro = findViewById(R.id.img_proc);
        txtNameProc = findViewById(R.id.txt_name1);

        txtPrice = findViewById(R.id.txt_price_pro);
        txtId = findViewById(R.id.txt_id_pro);
        txtTonKho = findViewById(R.id.txt_tonKho);
        txtDecrip = findViewById(R.id.txt_decrep);
    }

    void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.12:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(APIServices.class).DetailProc(getIntent().getIntExtra("id", 0)).enqueue(new Callback<GetDetailProc>() {
            @Override
            public void onResponse(Call<GetDetailProc> call, Response<GetDetailProc> response) {
                GetDetailProc getDetailProc = response.body();
                ArrayDetailProc dl = getDetailProc.data.get(0);
                txtDecrip.setText(dl.description);
                Picasso.get().load(dl.images).into(imgPro);
                txtPrice.setText("Giá: " + dl.price + "");
                txtNameProc.setText(dl.name);


            }

            @Override
            public void onFailure(Call<GetDetailProc> call, Throwable t) {
                //dsds
            }
        });

    }
}
