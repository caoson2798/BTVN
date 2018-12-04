package com.example.daiphongpc.gd3.Recyclerview.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.daiphongpc.gd3.R;

public class AddContactActivity extends AppCompatActivity {
    EditText editName,editAge,editAddr;
    Button btnSave,btnDel,btnUp;
    String name="";
    int age;
    String addr="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        addControls();
        addEvents();

    }

    private void addEvents() {
        if (getIntent().getSerializableExtra("contact1") != null){
            GoProContact contact= (GoProContact) getIntent().getSerializableExtra("contact1");
            editName.setText(contact.getName().toString());
            editAddr.setText(contact.getAddr());
            editAge.setText(contact.getAge()+"");
//            Log.d("ktdl", contact.getName()+" "+contact.getAddr());
            btnDel.setVisibility(View.VISIBLE);


        }


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getIntent().getSerializableExtra("contact1") != null){
                    name=editName.getText().toString();
                    age=Integer.parseInt(editAge.getText().toString());
                    addr=editAddr.getText().toString();
                    int position=getIntent().getExtras().getInt("position");
                    GoProContact contact=new GoProContact(name,addr,age);
                    Intent intent=new Intent();
                    intent.putExtra("editContact",contact);
                    intent.putExtra("i",position);
                    setResult(999,intent);
                    finish();
                }else {
                    GoProContact contact=new GoProContact(editName.getText().toString(),editAddr.getText().toString(),
                            Integer.parseInt(editAge.getText().toString()));
                    Intent intent=new Intent();
                    intent.putExtra("contact",contact);
                    setResult(113,intent);
                    finish();
                }
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=getIntent().getExtras().getInt("position");
                Intent intent=new Intent();
                intent.putExtra("i",position);
                setResult(998,intent);
                finish();
            }
        });
    }

    private void addControls() {
        btnDel=findViewById(R.id.btn_del);
        editName = findViewById(R.id.edit_name);
        editAge = findViewById(R.id.edit_age);
        editAddr=findViewById(R.id.edit_addr);
        btnSave=findViewById(R.id.btn_save);
    }
}
