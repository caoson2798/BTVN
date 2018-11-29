package com.example.daiphongpc.gd3.BT_Edit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

public class EditActivity extends AppCompatActivity {
    EditText edit_1,edit_2,edit_3,edit_4,edit_5,edit_6;
    String s_total="";
    TextView txt_notify;
    LinearLayout ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        addConrols();
        addEvent();
    }

    private void addEvent() {
        edit_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==1){
                    edit_2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                s_total=edit_1.getText().toString()+edit_2.getText().toString()+edit_3.getText().toString()
                        +edit_4.getText().toString()+edit_5.getText().toString()+edit_6.getText().toString();
                if (s_total.length()==6){
                    ln.setVisibility(View.VISIBLE);
                    txt_notify.setVisibility(View.INVISIBLE);
                }else {
                    ln.setVisibility(View.INVISIBLE);
                    txt_notify.setVisibility(View.VISIBLE);
                }

            }
        });
        //
        edit_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==1){
                    edit_3.requestFocus();
                }
                if (count==0){
                    edit_1.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                s_total=edit_1.getText().toString()+edit_2.getText().toString()+edit_3.getText().toString()
                        +edit_4.getText().toString()+edit_5.getText().toString()+edit_6.getText().toString();
                if (s_total.length()==6){
                    ln.setVisibility(View.VISIBLE);
                    txt_notify.setVisibility(View.INVISIBLE);
                }else {
                    ln.setVisibility(View.INVISIBLE);
                    txt_notify.setVisibility(View.VISIBLE);
                }
            }
        });
        //
        edit_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==1){
                    edit_4.requestFocus();
                }
                if (count==0){
                    edit_2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                s_total=edit_1.getText().toString()+edit_2.getText().toString()+edit_3.getText().toString()
                        +edit_4.getText().toString()+edit_5.getText().toString()+edit_6.getText().toString();
                if (s_total.length()==6){
                    ln.setVisibility(View.VISIBLE);
                    txt_notify.setVisibility(View.INVISIBLE);
                }else {
                    ln.setVisibility(View.INVISIBLE);
                    txt_notify.setVisibility(View.VISIBLE);
                }
            }
        });
        //
        edit_4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count==1){

                }
                if (count==0){
                    edit_3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                s_total=edit_1.getText().toString()+edit_2.getText().toString()+edit_3.getText().toString()
                        +edit_4.getText().toString()+edit_5.getText().toString()+edit_6.getText().toString();
                if (s_total.length()==6){
                    ln.setVisibility(View.VISIBLE);
                    txt_notify.setVisibility(View.INVISIBLE);
                }else {
                    ln.setVisibility(View.INVISIBLE);
                    txt_notify.setVisibility(View.VISIBLE);
                }
            }
        });
        //

    }

    private void addConrols() {
        ln=findViewById(R.id.btn_svae);
        txt_notify=findViewById(R.id.txt_notify);
        edit_1=findViewById(R.id.edit_1);
        edit_2=findViewById(R.id.edit_2);
        edit_3=findViewById(R.id.edit_3);
        edit_4=findViewById(R.id.edit_4);


    }
}
