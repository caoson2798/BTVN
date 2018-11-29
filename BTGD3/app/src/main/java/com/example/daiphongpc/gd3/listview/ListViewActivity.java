package com.example.daiphongpc.gd3.listview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.daiphongpc.gd3.MainActivity;
import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ArrayList<String> arrName=new ArrayList<>();
    ListView lv_android003;
 //   ArrayAdapter<String> adapter;
    Android003Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        addControls();


    }

    private void addControls() {
        lv_android003=findViewById(R.id.lv_android003);
        preparData();
      //  adapter=new ArrayAdapter<>(ListViewActivity.this,android.R.layout.simple_list_item_1,arrName);
        adapter=new Android003Adapter();
        adapter.data=arrName;
        adapter.context=this;
        lv_android003.setAdapter(adapter);

    }

    void preparData(){
        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");

        arrName.add("Thăng");
        arrName.add("Thịnh");
        arrName.add("Hoàng");
        arrName.add("Mạnh");
        arrName.add("Dương");
        arrName.add("Long");
        arrName.add("Tiến");
        arrName.add("Hiển");
        arrName.add("Tân");
        arrName.add("Sơn");
        arrName.add("Cường");
    }
}
