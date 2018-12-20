package com.example.daiphongpc.gd3.json;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.json.detail.DetailActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class JsonDemoActivity extends AppCompatActivity {
    ArrayList<Product> arrData=new ArrayList<>();
    RecyclerView rcvProduct;
    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_demo);
        addControls();
        adapter=new ProductAdapter(arrData,this);
        adapter.setOnClickItemRV(new ProductAdapter.CallBackEvents() {
            @Override
            public void onClickItem(int pos) {
                Intent intent=new Intent(JsonDemoActivity.this,DetailActivity.class);
                startActivity(intent);

            }
        });
        adapter.arrData=arrData;
        adapter.context=this;

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcvProduct.setLayoutManager(gridLayoutManager);
        rcvProduct.setAdapter(adapter);
        String strListProduct=getStringFromAsset("list_product.json");

        //tạo ra json từ string
        try {
            JSONObject jsonObject=new JSONObject(strListProduct);
            //làm việc với json

            //lấy status
            int status=jsonObject.getInt("status");
            String message=jsonObject.getString("message");
            JSONArray jsonArray=jsonObject.getJSONArray("data");
            Log.d("JSON", "onCreate: "+status);
            for (int i=0; i<jsonArray.length();i++){
                JSONObject jsonObject1=jsonArray.getJSONObject(i);
                Product product=new Product();
                product.setCode(jsonObject1.getInt("code"));
                product.setWeight(jsonObject1.getInt("weight"));
                product.setBasePrice(jsonObject1.getInt("basePrice"));
                product.setConversionValue(jsonObject1.getInt("conversionValue"));
                product.setId(jsonObject1.getInt("id"));

                product.setCategoryName(jsonObject1.getString("categoryName"));
                product.setImage(jsonObject1.getString("image"));
                product.setCreatedDate(jsonObject1.getString("createdDate"));
                product.setName(jsonObject1.getString("name"));

                arrData.add(product);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        adapter.notifyDataSetChanged();
    }

    private void addControls() {
        rcvProduct=findViewById(R.id.rcv_product);


    }


    //lấy file từ asset ra
    private String getStringFromAsset(String fileName){
        String text = "";
        try{
            InputStream inputStream = getAssets().open(fileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    //convert về json

    //thao táo với json

}
