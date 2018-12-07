package com.example.daiphongpc.gd3.sharepredferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.daiphongpc.gd3.R;

public class HomeActivity extends AppCompatActivity {
    ListView lvShoes;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addControls();
    }

    private void addControls() {
        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
        lvShoes=findViewById(R.id.lv_shose);
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");  adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");  adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");  adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");  adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");  adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");    adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        adapter.add("Azidas");
        adapter.add("chaiko");
        lvShoes.setAdapter(adapter);
    }

    public void xuLyDangXuat(View view) {
        Intent intent=new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
