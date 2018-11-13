package com.example.daiphongpc.myapplication;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SachActivity extends TaiLieuActivity {
    EditText edit_author,edit_nameBook,edit_numberPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sach);
        addControl();
        addEvent();
        Toast.makeText(SachActivity.this,"Sach đc gọi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void addControl() {
        super.addControl();
        edit_author=findViewById(R.id.edit_author);
        edit_nameBook=findViewById(R.id.edit_bookName);
        edit_numberPage=findViewById(R.id.edit_numerPage);
    }

    @Override
    protected void processShow() {
        try {
            String author=edit_author.getText().toString();
            String nameBook=edit_nameBook.getText().toString();
            int numberPage=Integer.parseInt(edit_numberPage.getText().toString());
            String ID=super.edit_ID.getText().toString();
            String publisher=super.edit_publisher.getText().toString();
            int soPhatHanh=Integer.parseInt(super.edit_soPhatHanh.getText().toString());
            Sach sach=new Sach(ID,publisher,soPhatHanh,author,nameBook,numberPage);
            String currentLog=txt_show.getText().toString();
            txt_show.setText(sach.toString()+"\n"+currentLog);
        }catch (Exception e){
            Toast.makeText(SachActivity.this,e.toString(),Toast.LENGTH_LONG).show();
        }


    }

    @Override
    protected void addEvent() {
        super.addEvent();
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processShow();
                Log.d("kt","clicked");
            }
        });

    }
}
