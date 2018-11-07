package com.example.daiphongpc.gd3.qlyTaiLieu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

public class TaiLieuActivity extends AppCompatActivity {
    EditText editMa,editNXB,editSBXH;
    TextView txt_show;
    Button btnSave1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tai_lieu_layout);
        addControl();
        addEvent();
    }

    private void addEvent() {
        btnSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaiLieu taiLieu=new TaiLieu();
                taiLieu.maTaiLieu=editMa.getText().toString();
                taiLieu.nhaXuatBan=editNXB.getText().toString();
                taiLieu.soBanPhatHanh=Integer.parseInt(editSBXH.getText().toString());


            }
        });
    }

    public void addControl() {
        txt_show=findViewById(R.id.txtShow1);
        editMa=findViewById(R.id.edit_Ma2);
        editNXB=findViewById(R.id.edit_NXB2);
        editSBXH=findViewById(R.id.edit_SoBanPhatHanh2);
        btnSave1=findViewById(R.id.btnSave1);
    }
}
