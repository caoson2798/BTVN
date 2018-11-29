package com.example.daiphongpc.gd3.BT_Edit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

public class BTeditActivity extends AppCompatActivity {
    TextView txt;
    EditText edit_1,edit_2,edit_3,edit_4;
    String s_total="";
    TextView txt_notify;
    Button btn_conFirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btedit);
        txt=findViewById(R.id.txt);
        txt.setTextColor(Color.RED);
        addControl();
    }

    private void addControl() {
        edit_1=findViewById(R.id.edit_1);
        edit_2=findViewById(R.id.edit_2);
        edit_3=findViewById(R.id.edit_3);
        edit_4=findViewById(R.id.edit_4);
    }
}
