package com.example.daiphongpc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TaiLieuActivity extends AppCompatActivity {
    EditText edit_ID,edit_publisher,edit_soPhatHanh;
    TextView txt_show;
    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tai_lieu);
        addControl();
        addEvent();
        Toast.makeText(TaiLieuActivity.this,"Tài liệu được gọi",Toast.LENGTH_SHORT).show();
    }

    protected void addEvent() {
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processShow();

            }
        });

    }

    protected void processShow() {
       String ID=edit_ID.getText().toString();
       String publisher=edit_publisher.getText().toString();
       int soPhatHanh=Integer.parseInt(edit_soPhatHanh.getText().toString());
       TaiLieu taiLieu=new TaiLieu(ID,publisher,soPhatHanh);
       String curentString=txt_show.getText().toString();
       txt_show.setText(taiLieu.toString()+"\n"+curentString);

    }

    protected void addControl() {
        edit_ID=findViewById(R.id.edit_ID);
        edit_publisher=findViewById(R.id.edit_publisher);
        edit_soPhatHanh=findViewById(R.id.edit_soPhatHanh);
        btn_save=findViewById(R.id.btn_save);
        txt_show=findViewById(R.id.txt_show);
    }
}
