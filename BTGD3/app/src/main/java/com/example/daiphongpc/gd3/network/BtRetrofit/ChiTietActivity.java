package com.example.daiphongpc.gd3.network.BtRetrofit;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.json.detail.Adapter.ImageAdapter;
import com.example.daiphongpc.gd3.json.detail.model.Attributes;
import com.example.daiphongpc.gd3.json.detail.model.Inventories;
import com.example.daiphongpc.gd3.network.APIServices;

import java.text.DecimalFormat;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChiTietActivity extends AppCompatActivity {
    ViewPager vpImg;
    ArrayList<String> arrLinkImg=new ArrayList<>();
    ImageAdapter adapter;
    ArrayList<ThuocTInh> arrAtt=new ArrayList<>();
    TextView txtPriceDetailRoot,txtName,txtPriceDetail,txtSize,txtWeigh,txtNameDetail,txtChiNhanh;
    ArrayList<BangTomTat> arrIn=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);
        addControls();
    }
    private void addControls() {
        txtChiNhanh=findViewById(R.id.txt_ChiNhanh);
        txtName=findViewById(R.id.txt_name);
        txtPriceDetailRoot=findViewById(R.id.txt_price_detail_root);
        txtNameDetail=findViewById(R.id.txt_name_detail);
        txtPriceDetail=findViewById(R.id.txt_price_detail);
        txtSize=findViewById(R.id.txt_size);
        txtWeigh=findViewById(R.id.txt_weight);

        vpImg=findViewById(R.id.vp_img);
        prepreaData();

        adapter=new ImageAdapter(arrLinkImg,this);
        vpImg.setAdapter(adapter);
    }

    private void prepreaData() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://www.json-generator.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofit.create(APIServices.class).CallDetailData().enqueue(new Callback<SanPham>() {
            @Override
            public void onResponse(Call<SanPham> call, Response<SanPham> response) {
                SanPham sanPham=response.body();
              //  Log.d("yeucau", "onResponse: "+response.body());
                String so="";
                for (int i = 0; i <sanPham.getImages().size() ; i++) {
                    arrLinkImg.add(sanPham.getImages().get(i));
                    String tenChiNhanh=sanPham.getInventories().get(i).getBranchName();
                    so=so+"\n"+tenChiNhanh;
                    txtChiNhanh.setText("*"+so);

                }
                txtNameDetail.setText(sanPham.getName());
                txtWeigh.setText(sanPham.getWeight()+" kg");
                DecimalFormat format=new DecimalFormat("###,###,###");
                txtPriceDetailRoot.setText(format.format(Integer.parseInt(sanPham.getAttributes().get(0).getAttributeValue().toString()))+" VND");
                txtPriceDetail.setText(format.format(Integer.parseInt(sanPham.getAttributes().get(0).getAttributeValue()))+" VND");

                txtSize.setText(sanPham.getAttributes().get(1).getAttributeValue());


                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<SanPham> call, Throwable t) {
                Log.d("loi", "onFailure: "+t.toString());
            }
        });
    }
}
