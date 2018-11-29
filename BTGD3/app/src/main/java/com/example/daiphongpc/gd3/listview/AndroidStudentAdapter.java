package com.example.daiphongpc.gd3.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class AndroidStudentAdapter extends BaseAdapter {
    ArrayList<AndroidStudent> arrData;
    Context context;

    public AndroidStudentAdapter(ArrayList<AndroidStudent> arrData, Context context) {
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
        ViewHolder1 viewHolder1;
        if (convertView==null){
            viewHolder1=new ViewHolder1();
            convertView=LayoutInflater.from(context).inflate(R.layout.android_student_item,parent,false);
            viewHolder1.txt_name_item=convertView.findViewById(R.id.txt_name_item);
            convertView.setTag(viewHolder1);
        }else {
            viewHolder1= (ViewHolder1) convertView.getTag();
        }
        AndroidStudent student=arrData.get(position);
        viewHolder1.txt_name_item.setText(student.getId()+" "+student.getName()+" "+student.getAddr()+" "+student.phoneName);
        return convertView;
    }
    class ViewHolder1{
        TextView txt_name_item;
    }
}
