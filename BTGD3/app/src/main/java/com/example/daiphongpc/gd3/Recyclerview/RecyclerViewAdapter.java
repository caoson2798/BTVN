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

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.StudentViewHolder> {
     Context context;
     ArrayList<Student> data;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.listview_item_layout,viewGroup,false);
        StudentViewHolder studentViewHolder=new StudentViewHolder(view);
        return studentViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        Student student=data.get(i);
        studentViewHolder.txtName.setText(student.getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView txtPreFix,txtName;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPreFix=itemView.findViewById(R.id.txt_prefix);
            txtName=itemView.findViewById(R.id.txt_name);
        }
    }
}
