package com.example.daiphongpc.gd3.sharepredferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.sharepredferences.util.AppConfig;

public class LoginActivity extends AppCompatActivity {
    Button btnSave;
    EditText editEmail,editPass;
    public static CheckBox chk;
//    String email="";
//    String pass="";
//    String status_email="";
//    String status_pass="";

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControls();
//        chk.setChecked(AppConfig.getKeepLogin(this));
//        editEmail.setText(status_email);
//        editPass.setText(status_pass);

    }

    @Override
    protected void onPause() {
        super.onPause();
        AppConfig.setUserName(editEmail.getText().toString(),this);
        AppConfig.setPass(editPass.getText().toString(),this);
        AppConfig.setKeepLogin(chk.isChecked(),this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        if (AppConfig.getKeepLogin(this)){
            editEmail.setText(AppConfig.getUserName(this));
            editPass.setText(AppConfig.getPass(this));
            chk.setChecked(AppConfig.getKeepLogin(this));
        }else {
            editPass.setText("");
            editEmail.setText("");
            chk.setChecked(false);
        }

    }

    private void addControls() {
        editEmail=findViewById(R.id.edt_email);
        editPass=findViewById(R.id.edit_pass);
        chk = findViewById(R.id.chk);
        btnSave = findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=editEmail.getText().toString();
                String pass=editPass.getText().toString();
                if (user.equals("admin") && pass.equals("123456")){
                    Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"faile",Toast.LENGTH_LONG).show();
                }

            }
        });
//        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    email=editEmail.getText().toString();
//                    pass=editPass.getText().toString();
//                    AppConfig.setKeepLogin(true, LoginActivity.this);
//                    AppConfig.setUserName("son",LoginActivity.this);
//                    AppConfig.setPass("12345",LoginActivity.this);
//                    status_email=AppConfig.getUserName(LoginActivity.this);
//                    status_pass=AppConfig.getPass(LoginActivity.this);
//                    Log.d("ktt", "onCheckedChanged: "+status_email+" "+status_pass);
//                } else {
//                    chk.setChecked(false);
//                    AppConfig.setUserName("",LoginActivity.this);
//                    AppConfig.setPass("",LoginActivity.this);
//                    AppConfig.setKeepLogin(false, LoginActivity.this);
//                }
//            }
//        });
    }
}
