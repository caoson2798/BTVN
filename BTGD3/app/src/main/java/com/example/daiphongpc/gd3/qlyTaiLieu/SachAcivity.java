package com.example.daiphongpc.gd3.qlyTaiLieu;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

import com.example.daiphongpc.gd3.R;

public class SachAcivity extends TaiLieuActivity {
    EditText editAuthor,editName_Booke,editNumber_Page;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sach_layout);

    }
    //tạp chí, báo

    @Override
    public void addControl() {
        super.addControl();
        editAuthor=findViewById(R.id.edit_author);
        editName_Booke=findViewById(R.id.edit_nameBook);
        editNumber_Page=findViewById(R.id.edit_nume_page);
    }
}
