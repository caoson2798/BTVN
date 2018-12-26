package com.example.daiphongpc.gd3.network.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.RetaurantType;
import com.example.daiphongpc.gd3.network.RetaurantTypeResultRequest;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<RetaurantType> arrData;
    public static boolean check=false;
    ImageView imgTick;
    public ListAdapter(Context context, ArrayList<RetaurantType> arrData) {
        this.context = context;
        this.arrData = arrData;
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
        convertView=LayoutInflater.from(context).inflate(R.layout.item_dongian,parent,false);
        RetaurantType retaurantTypeResultRequest=arrData.get(position);
        TextView txtName=convertView.findViewById(R.id.txt_name);
        imgTick=convertView.findViewById(R.id.img_tick);
        if (retaurantTypeResultRequest.isTick()){
            imgTick.setVisibility(View.VISIBLE);
        }else {
            imgTick.setVisibility(View.INVISIBLE);
        }
        txtName.setText(retaurantTypeResultRequest.getRestaurantTypeName());
        return convertView;
    }
    public interface Abc{
        void setTick(ImageView tick);
    }
}
