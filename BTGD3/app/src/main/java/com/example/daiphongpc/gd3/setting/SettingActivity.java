package com.example.daiphongpc.gd3.setting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.daiphongpc.gd3.R;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Switch swWifi, swBlueTooth;
    CheckBox chk_BatterySave;
    Button btn_save, btn_clear;
    int dem=0;
    String s_total="";
    EditText editphoneName, editphoneName1, editphoneName2, editphoneName3, editphoneName4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        addControls();
        addEvent();
    }

    private void addEvent() {

        //cach 1
//        btn_save.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                boolean isWifion=swWifi.isChecked();
//                boolean isbluetooth=swBlueTooth.isChecked();
//                boolean isBatterySaveOn=chk_BatterySave.isChecked();
//                String phoneName=editphoneName.getText().toString();
//                Log.d("ktSetting",phoneName+" "+isWifion+" "+isbluetooth+" "+isBatterySaveOn);
//
//            }
//        });
        //cah2
        btn_save.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        swWifi.setOnCheckedChangeListener(this);
        swBlueTooth.setOnCheckedChangeListener(this);
        chk_BatterySave.setOnCheckedChangeListener(this);


        editphoneName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edit", "beforeTextChanged:" + "s=" + s + " start=" + start + " count=" + count + " after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edit", "onTextChanged" + " s=" + s + " start=" + start + " count=" + count + " before=" + before);
                if (count == 1) {
                    editphoneName1.requestFocus();
                }


            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edit", "afterTextChanged " + s);
                s_total=editphoneName.getText().toString()+editphoneName1.getText().toString()
                        +editphoneName2.getText().toString()+editphoneName3.getText().toString()+editphoneName4.getText().toString();
                if(s_total.length()==5){
                    btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }

            }
        });
        editphoneName1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edit", "beforeTextChanged:" + "s=" + s + " start=" + start + " count=" + count + " after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edit", "onTextChanged" + " s=" + s + " start=" + start + " count=" + count + " before=" + before);
                if (count == 1) {
                    dem=dem+1;
                    editphoneName2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edit", "afterTextChanged " + s);
                s_total=editphoneName.getText().toString()+editphoneName1.getText().toString()
                        +editphoneName2.getText().toString()+editphoneName3.getText().toString()+editphoneName4.getText().toString();
                if(s_total.length()==5){
                    btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }

            }
        });
        editphoneName2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edit", "beforeTextChanged:" + "s=" + s + " start=" + start + " count=" + count + " after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edit", "onTextChanged" + " s=" + s + " start=" + start + " count=" + count + " before=" + before);
                if (count == 1) {
                    dem=dem+1;
                    editphoneName3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edit", "afterTextChanged " + s);
                s_total=editphoneName.getText().toString()+editphoneName1.getText().toString()
                        +editphoneName2.getText().toString()+editphoneName3.getText().toString()+editphoneName4.getText().toString();
                if(s_total.length()==5){
                    btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }

            }
        });
        editphoneName3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edit", "beforeTextChanged:" + "s=" + s + " start=" + start + " count=" + count + " after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edit", "onTextChanged" + " s=" + s + " start=" + start + " count=" + count + " before=" + before);
                if (count == 1) {
                    dem=dem+1;
                    editphoneName4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edit", "afterTextChanged " + s);
                s_total=editphoneName.getText().toString()+editphoneName1.getText().toString()
                        +editphoneName2.getText().toString()+editphoneName3.getText().toString()+editphoneName4.getText().toString();
                if(s_total.length()==5){
                    btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }

            }
        });
        editphoneName4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("edit", "beforeTextChanged:" + "s=" + s + " start=" + start + " count=" + count + " after=" + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("edit", "onTextChanged" + " s=" + s + " start=" + start + " count=" + count + " before=" + before);
                if (count == 1) {

                   btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }


            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("edit", "afterTextChanged " + s);
                s_total=editphoneName.getText().toString()+editphoneName1.getText().toString()
                        +editphoneName2.getText().toString()+editphoneName3.getText().toString()+editphoneName4.getText().toString();
                if(s_total.length()==5){
                    btn_save.setVisibility(View.VISIBLE);
                }else {
                    btn_save.setVisibility(View.INVISIBLE);
                }

            }
        });
        Log.d("dem",dem+"");

    }

    private void addControls() {

        btn_clear = findViewById(R.id.btn_clear);
        editphoneName = findViewById(R.id.edit_phoneName);
        editphoneName1 = findViewById(R.id.edit_phoneName1);
        editphoneName2 = findViewById(R.id.edit_phoneName2);
        editphoneName3 = findViewById(R.id.edit_phoneName3);
        editphoneName4 = findViewById(R.id.edit_phoneName4);
        swWifi = findViewById(R.id.sw_wifi);
        swBlueTooth = findViewById(R.id.sw_blutooth);
        chk_BatterySave = findViewById(R.id.chk_BatterySave);
        btn_save = findViewById(R.id.btn_save);
    }

    @Override
    public void onClick(View v) {
        //   Log.d("Click", "onClick: ");
        int id = v.getId();
        switch (v.getId()) {
            case R.id.btn_save:

                break;
            case R.id.btn_clear:
                Log.d("btn_clear", "clear ");
                actionClear();
                break;
            case R.id.chk_BatterySave: {
                break;
            }

        }
    }

    private void actionClear() {
        //dua ve off
        //ten dt="
        swBlueTooth.setChecked(false);
        swWifi.setChecked(false);
        chk_BatterySave.setChecked(false);
        editphoneName.setText("");


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        int id = buttonView.getId();
        switch (id) {
            case R.id.sw_wifi: {
                if (isChecked) {
                    Toast.makeText(this, "wifi is on", Toast.LENGTH_SHORT).show();
                }
                break;
            }

            case R.id.sw_blutooth: {
                if (isChecked) {
                    Toast.makeText(this, "bluetooth is on", Toast.LENGTH_SHORT).show();
                }
                break;
            }

        }
    }
}
