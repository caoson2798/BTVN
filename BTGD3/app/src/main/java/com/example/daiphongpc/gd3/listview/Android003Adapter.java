package com.example.daiphongpc.gd3.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class Android003Adapter extends BaseAdapter {
    ArrayList<String> data;
    Context context;
    @Override
    public int getCount() {
        return data.size();
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
        ViewHolder viewHolder;
        if (convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.listview_item_layout,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.txt_frefix=convertView.findViewById(R.id.txt_prefix);
            viewHolder.txt_name=convertView.findViewById(R.id.txt_name);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //lấy view từ file xml

        //hiển thị nội dung vào view


        String name=data.get(position);
        viewHolder.txt_name.setText(name+"");
        char prefix=name.charAt(0);
        viewHolder.txt_frefix.setText(prefix+"");

        return convertView;
    }
    //dùng viewholder để tăng hiệu năng
    class ViewHolder{
        TextView txt_frefix;
        TextView txt_name;
        public ViewHolder() {

        }
    }
}
