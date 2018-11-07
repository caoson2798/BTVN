package com.example.daiphongpc.gd4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_input;
    TextView txt_result;
    Button btn_bin,btn_Dec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addEvent() {

        btn_bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTinhToan_Bin();
            }
        });
        btn_Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyTinh_Dec();
            }
        });
    }

    private void xuLyTinh_Dec() {
        String s=edit_input.getText().toString();
        char[] c=s.toCharArray();
        double dec=0;
        int x=c.length-1;

        for (int i=0;i<c.length;i++){
            if (c[i]=='1'){
                dec=dec+Math.pow(2,(x-i));
            }
        }
        txt_result.setText(dec+"");
        Log.d("ktchs",String.valueOf(s.length()));

    }

    private void xuLyTinhToan_Bin() {
        int i;
        String bin="";
        int n=Integer.parseInt(edit_input.getText().toString());
        while (n>0){
            i=n%2;
            bin=bin+i;
            n=n/2;
        }
        StringBuilder s=new StringBuilder(bin).reverse();
        txt_result.setText(s.toString());

    }

    private void addControls() {
        btn_Dec=findViewById(R.id.btn_Dec);
        edit_input=findViewById(R.id.edit_input);
        btn_bin=findViewById(R.id.btn_bin);
        txt_result=findViewById(R.id.txt_result);
    }
}
