package com.example.daiphongpc.gd3.Recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.Student;

import java.util.ArrayList;

public class MulTiTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Object> data;
    Context context;

    @Override
    public int getItemViewType(int position) {
        //nếu đấy là string thì trả về là 0
        if (data.get(position) instanceof Student){
            return 1;
        }else {
            return 0;
        }
        //nếu đấy là đối tượng student thì trả về 1
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i==1){
            View view=LayoutInflater.from(context).inflate(R.layout.listview_item_layout,viewGroup,false);
            return new Student1ViewHolder(view);
        }else {
            View view=LayoutInflater.from(context).inflate(R.layout.item_header,viewGroup,false);
            return new HeaderViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (data.get(i) instanceof String){
            ((HeaderViewHolder)viewHolder).txtHeader.setText((String)data.get(i));
        }else {
            Student student= (Student) data.get(i);
            ((Student1ViewHolder)viewHolder).txtName.setText(student.getName());
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView txtHeader;

        public HeaderViewHolder(@NonNull View itemView) {

            super(itemView);
            txtHeader=itemView.findViewById(R.id.txt_header);
        }
    }

    class Student1ViewHolder extends RecyclerView.ViewHolder{
        TextView txtPreFix,txtName;
        public Student1ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPreFix=itemView.findViewById(R.id.txt_prefix);
            txtName=itemView.findViewById(R.id.txt_name);
        }
    }
}
