package com.example.daiphongpc.gd3.LTNetWork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.daiphongpc.gd3.LTNetWork.Model.LoginAndroidGoPro;
import com.example.daiphongpc.gd3.R;
import com.example.daiphongpc.gd3.network.APIServices;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegisterActivity extends AppCompatActivity {


    EditText editNewUser,editNewPass,editRepreatPass;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newpass=editNewPass.getText().toString();
                String repreat=editRepreatPass.getText().toString();
                if (newpass.equals(repreat)){
                    getData();
                }else {
                    Toast.makeText(RegisterActivity.this,"2 mật khẩu phải giống nhau",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void getData() {
        String user=editNewUser.getText().toString();
        String pass=editNewPass.getText().toString();
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.1.12:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofit.create(APIServices.class).dangKy(user,pass).enqueue(new Callback<LoginAndroidGoPro>() {
            @Override
            public void onResponse(Call<LoginAndroidGoPro> call, Response<LoginAndroidGoPro> response) {
                LoginAndroidGoPro loginAndroidGoPro=response.body();
                if (loginAndroidGoPro.status==1){
                    Toast.makeText(RegisterActivity.this,"Đăng ký thành công",Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(RegisterActivity.this,"xảy ra lỗi",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginAndroidGoPro> call, Throwable t) {

            }
        });
    }

    private void addControls() {
        editNewPass=findViewById(R.id.edit_new_pass);
        editNewUser=findViewById(R.id.edit_new_user);
        editRepreatPass=findViewById(R.id.edit_repreat_pass);
        btnRegister=findViewById(R.id.btn_register);
    }
}
