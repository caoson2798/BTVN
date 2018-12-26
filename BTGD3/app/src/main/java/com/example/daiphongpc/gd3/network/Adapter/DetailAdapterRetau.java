package com.example.daiphongpc.gd3.network.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.InventoryItem;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DetailAdapterRetau extends BaseAdapter {
    ArrayList<InventoryItem> arrData;
    Context context;

    public DetailAdapterRetau(ArrayList<InventoryItem> arrData, Context context) {
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
        convertView=LayoutInflater.from(context).inflate(R.layout.item_detail,parent,false);
        TextView txtNameDetail=convertView.findViewById(R.id.txt_name_detail);
        TextView txtPriceDetail=convertView.findViewById(R.id.txt_price_detail);
        ImageView imgDetail=convertView.findViewById(R.id.img_detailr);
        txtNameDetail.setText(arrData.get(position).inventoryItemName);
        txtPriceDetail.setText("Giá: "+arrData.get(position).price+"VND");

        InputStream inputstream= null;
        try {
            inputstream = context.getAssets().open("icondefaut/"
                    +arrData.get(position).iconFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Drawable drawable = Drawable.createFromStream(inputstream, null);
        imgDetail.setImageDrawable(drawable);
        return convertView;
    }
}
