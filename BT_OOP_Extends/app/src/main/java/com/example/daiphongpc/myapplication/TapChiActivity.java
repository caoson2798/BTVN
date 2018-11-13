package com.example.daiphongpc.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TapChiActivity extends TaiLieuActivity {

    EditText edit_thangPhatHanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_chi);
        addControl();
        addEvent();
    }

    @Override
    protected void addControl() {
        super.addControl();
        edit_thangPhatHanh=findViewById(R.id.edit_thangPhatHanh);
    }

    @Override
    protected void processShow() {

        String ID=edit_ID.getText().toString();
        String publisher=edit_publisher.getText().toString();
        int soPhatHanh=Integer.parseInt(edit_soPhatHanh.getText().toString());
        int thangPhatHanh=Integer.parseInt(edit_thangPhatHanh.getText().toString());
       TapChi tapChi=new TapChi(ID,publisher,soPhatHanh,thangPhatHanh);
        String curentString=txt_show.getText().toString();
        txt_show.setText(tapChi.toString()+"\n"+curentString);
        
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
