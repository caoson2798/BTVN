package com.example.daiphongpc.gd3.network;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daiphongpc.gd3.R;
import com.roger.catloadinglibrary.CatLoadingView;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginWithNetWorkActivity extends AppCompatActivity {
    EditText editUser,editPass;
    Button btnLogin;
    ImageView imgProfilePicture;
    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_net_work);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   final ProgressDialog dialog=ProgressDialog.show(LoginWithNetWorkActivity.this,"Đang đăng nhập","vui lòng đợi");
                final CatLoadingView dialog=new CatLoadingView();
                dialog.show(getSupportFragmentManager(), "");
                String user=editUser.getText().toString();
                String pass=editPass.getText().toString();
                Retrofit retrofit=new Retrofit.Builder().baseUrl("http://192.168.1.9:3000/")
                        .addConverterFactory(GsonConverterFactory.create()).build();
                retrofit.create(APIServices.class).login(user,pass).enqueue(new Callback<LoginResultRequest>() {
                    @Override
                    public void onResponse(Call<LoginResultRequest> call, Response<LoginResultRequest> response) {
                        dialog.dismiss();
                        if (response.isSuccessful()){
                            LoginResultRequest loginResultRequest=response.body();
                            if (loginResultRequest.getStatus()==1){
                                txtHello.setText("xin chào: "+loginResultRequest.getData().getUsername());
                                Picasso.get().load(loginResultRequest.getData().getProfilePicture()).into(imgProfilePicture);
                            }else {
                                Toast.makeText(LoginWithNetWorkActivity.this,loginResultRequest.getMsg(),Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResultRequest> call, Throwable t) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    private void addControls() {
        editPass=findViewById(R.id.edit_pass);
        editUser=findViewById(R.id.edit_user);
        btnLogin=findViewById(R.id.btn_login);
        txtHello=findViewById(R.id.txt_hello);
        imgProfilePicture=findViewById(R.id.img_profile_picture);

    }
}
