package com.example.daiphongpc.gd3.Recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.Student;

import java.util.ArrayList;

public class MultiTypeRecyclerViewActivity extends AppCompatActivity {
    RecyclerView rcvMultiType;
    ArrayList<Object> arradata=new ArrayList<>();
    MulTiTypeAdapter adapter=new MulTiTypeAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_type_recycler_view);
        addControls();
        prepareData();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcvMultiType.setLayoutManager(linearLayoutManager);
        adapter.data=arradata;
        adapter.context=this;
        rcvMultiType.setAdapter(adapter);
    }

    private void addControls() {
        rcvMultiType=findViewById(R.id.rv_MultiType);
    }
    void prepareData(){
        arradata.add("20/11/2017");
        for (int i = 0; i < 30; i++) {
            Student student=new Student("sv"+i,22,"sv_addr"+i);
            arradata.add(student);
        }
        arradata.add("20/11/2018");
        for (int i = 0; i < 30; i++) {
            Student student=new Student("sv"+i,22,"sv_addr"+i);
            arradata.add(student);
        }
    }
}
