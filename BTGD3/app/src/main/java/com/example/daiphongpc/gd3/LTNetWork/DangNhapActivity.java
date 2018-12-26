package com.example.daiphongpc.gd3.LTNetWork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daiphongpc.gd3.LTNetWork.Model.LoginAndroidGoPro;
import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.APIServices;
import com.example.daiphongpc.gd3.network.ListRestaurantTypeAtivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DangNhapActivity extends AppCompatActivity {

    EditText editUser,editPass;
    Button btnLogin;
    TextView txtRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        addControls();
        addEvents();
    }

    private void addEvents() {
        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DangNhapActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });
    }

    private void addControls() {
        editPass=findViewById(R.id.edit_pass);
        editUser=findViewById(R.id.edit_user);
        btnLogin=findViewById(R.id.btn_login);
        txtRegister=findViewById(R.id.txt_register);
    }
    void getData(){
        String user=editUser.getText().toString();
        String pass=editPass.getText().toString();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.1.12:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit.create(APIServices.class).dangNhap(user,pass).enqueue(new Callback<LoginAndroidGoPro>() {
            @Override
            public void onResponse(Call<LoginAndroidGoPro> call, Response<LoginAndroidGoPro> response) {
                LoginAndroidGoPro loginAndroidGoPro=response.body();
                if (loginAndroidGoPro.status==1){
                    Toast.makeText(DangNhapActivity.this,"đăng nhập thành công",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(DangNhapActivity.this,ListProductAndroidGoProActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(DangNhapActivity.this,"đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginAndroidGoPro> call, Throwable t) {

            }
        });
    }
}
