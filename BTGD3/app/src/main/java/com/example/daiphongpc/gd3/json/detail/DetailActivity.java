package com.example.daiphongpc.gd3.json.detail;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.json.detail.Adapter.ImageAdapter;
import com.example.daiphongpc.gd3.json.detail.model.Attributes;
import com.example.daiphongpc.gd3.json.detail.model.Inventories;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ViewPager vpImg;
    ArrayList<String> arrLinkImg=new ArrayList<>();
    ImageAdapter adapter;
    ArrayList<Attributes> arrAtt=new ArrayList<>();
    TextView txtPriceDetailRoot,txtName,txtPriceDetail,txtSize,txtWeigh,txtNameDetail,txtChiNhanh;
    ArrayList<Inventories> arrIn=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        addControls();


    }

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
    void prepreaData(){
        String json= getStringFromAsset("product.json");
        try {
            JSONObject jsonObjectRoot = new JSONObject(json);
            JSONArray jsonArray = jsonObjectRoot.getJSONArray("images");
            String nameProduct=jsonObjectRoot.getString("name");
            int weight=jsonObjectRoot.getInt("weight");
            JSONArray attributesArray=jsonObjectRoot.getJSONArray("attributes");
            JSONObject o1=attributesArray.getJSONObject(0);
            String gia=o1.getString("attributeValue");
            int priceDispaly=Integer.parseInt(gia);
            txtName.setText(nameProduct);


            txtNameDetail.setText(nameProduct);
            txtWeigh.setText(weight+" kg");
            DecimalFormat format=new DecimalFormat("###,###,###");
            txtPriceDetailRoot.setText(format.format(priceDispaly)+" VND");
            txtPriceDetail.setText(format.format(priceDispaly)+" VND");


            JSONObject o2=attributesArray.getJSONObject(1);
            String size=o2.getString("attributeValue");
            txtSize.setText(size);
            int s = jsonArray.length();
            String[] arr = new String[jsonArray.length()];
            for (int i = 0; i < jsonArray.length(); i++) {
                arr[i] = jsonArray.getString(i);
                arrLinkImg.add(arr[i]+"");
                Log.d("ktttt", "prepreaData: "+arrLinkImg.size());
            }
            //chi nhánh
            String so="";
            JSONArray arrinventories=jsonObjectRoot.getJSONArray("inventories");
            for (int i = 0; i <arrinventories.length() ; i++) {
                JSONObject object=arrinventories.getJSONObject(i);
                String tenChiNhanh=object.getString("branchName");
                so=so+"\n"+tenChiNhanh;
                txtChiNhanh.setText("*"+so);

            }

        } catch (JSONException e) {
            e.printStackTrace();
            Log.d("loi", "prepreaData: "+e.toString());
        }


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

}
