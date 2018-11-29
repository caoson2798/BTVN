package com.example.daiphongpc.gd3.Recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.Student;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rvStudent;
    ArrayList<Student> arrData=new ArrayList<>();
    RecyclerViewAdapter adapter=new RecyclerViewAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        addControls();
        prepareData();
        //can them LayoutManger de recylerView co the hoat dong
//        LinearLayoutManager linearLayoutManager;
//        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        rvStudent.setLayoutManager(gridLayoutManager);


        //adapater giống hết listview
        adapter.context=this;
        adapter.data=arrData;
        rvStudent.setAdapter(adapter);
    }

    private void addControls() {
        rvStudent=findViewById(R.id.rv_student);
    }
    void  prepareData(){
        for (int i = 0; i < 100; i++) {
            Student student=new Student("sv"+i,22,"sv_addr"+i);
            arrData.add(student);
        }
    }
}
