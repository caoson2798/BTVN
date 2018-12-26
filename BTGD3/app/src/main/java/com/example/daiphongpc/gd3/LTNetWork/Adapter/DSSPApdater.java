package com.example.daiphongpc.gd3.LTNetWork.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daiphongpc.gd3.LTNetWork.ListProductAndroidGoProActivity;
import com.example.daiphongpc.gd3.LTNetWork.Model.DataListAndroidGoPro;
import com.example.daiphongpc.gd3.LTNetWork.Model.ListSPAndroidGoPro;
import com.example.daiphongpc.gd3.LTNetWork.Model.LoginAndroidGoPro;
import com.example.daiphongpc.gd3.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DSSPApdater extends BaseAdapter {
    ArrayList<DataListAndroidGoPro> arrData;
    Context context;

    public DSSPApdater(ArrayList<DataListAndroidGoPro> arrData, Context context) {
        this.arrData = arrData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.item_lv_androidgopro,parent,false);
        DataListAndroidGoPro arrdl=arrData.get(position);

        ImageView imgProoduct=convertView.findViewById(R.id.img_name_product);
        TextView txtNameProduct,txtIdPro,txtPriceProuct;
        txtNameProduct=convertView.findViewById(R.id.txt_name_product);
        txtIdPro=convertView.findViewById(R.id.txt_id_pro);
        txtPriceProuct=convertView.findViewById(R.id.txt_price_pro);

        Picasso.get().load(arrdl.images).into(imgProoduct);
        txtNameProduct.setText(arrdl.name);
        txtPriceProuct.setText(arrdl.price+"");
        txtIdPro.setText(arrdl.id+"");
        return convertView;
    }
}
