package com.example.daiphongpc.gd3.Recyclerview.contact;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class GoProContactActivity extends AppCompatActivity {
    RecyclerView rvContact;
    FloatingActionButton fbAdd;
    ArrayList<GoProContact> arrData;
    GoProContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_pro_contact);
        addControls();

        arrData=new ArrayList<>();
        arrData.add(new GoProContact("Sơn","Hà nội",20));
        adapter=new GoProContactAdapter(this,arrData);
        addEvents();
        rvContact.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rvContact.setAdapter(adapter);

    }

    private void addEvents() {
        adapter.setOnClickItemRCV(new GoProContactAdapter.CallBackEvents() {
            @Override
            public void onClick(int i) {

                Intent intent=new Intent(GoProContactActivity.this,AddContactActivity.class);
                GoProContact contact=arrData.get(i);
                intent.putExtra("contact1",contact);
                intent.putExtra("position",i);
                Log.d("nameeeee", contact.getName());
                startActivityForResult(intent,999);
            }
        });

        fbAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GoProContactActivity.this,AddContactActivity.class);
                startActivityForResult(intent,113);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==113 && resultCode==113){
            GoProContact contact= (GoProContact) data.getExtras().getSerializable("contact");
            arrData.add(contact);
            adapter.notifyDataSetChanged();
        }
        if (requestCode==999 && resultCode==999){
            GoProContact contact= (GoProContact) data.getExtras().getSerializable("editContact");
            int position=data.getExtras().getInt("i");
            arrData.get(position).setName(contact.getName());
            arrData.get(position).setAddr(contact.getAddr());
            arrData.get(position).setAge(contact.getAge());
            adapter.notifyDataSetChanged();
        }
        if (requestCode==999 && resultCode==998){
            int postion=data.getExtras().getInt("i");
            arrData.remove(postion);
            adapter.notifyDataSetChanged();
        }
    }

    private void addControls() {
        rvContact=findViewById(R.id.rv_contact);
        fbAdd=findViewById(R.id.fb_add);
    }
}
