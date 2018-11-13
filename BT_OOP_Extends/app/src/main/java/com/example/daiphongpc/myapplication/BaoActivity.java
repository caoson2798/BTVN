package com.example.daiphongpc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

public class BaoActivity extends TaiLieuActivity {
    EditText edit_ngayPhatHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bao);
        addControl();
        addEvent();
    }

    @Override
    protected void addControl() {
        super.addControl();
        edit_ngayPhatHang=findViewById(R.id.edit_ngayPhatHanh);

    }

    @Override
    protected void processShow() {
        String ID=edit_ID.getText().toString();
        String publisher=edit_publisher.getText().toString();
        int soPhatHanh=Integer.parseInt(edit_soPhatHanh.getText().toString());
        int ngayph=Integer.parseInt(edit_ngayPhatHang.getText().toString());
        Bao bao=new Bao(ID,publisher,soPhatHanh,ngayph);
        String curentString=txt_show.getText().toString();
        txt_show.setText(bao.toString()+"\n"+curentString);
    }

    @Override
    protected void addEvent() {
        super.addEvent();
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processShow();
            }
        });
    }
}
