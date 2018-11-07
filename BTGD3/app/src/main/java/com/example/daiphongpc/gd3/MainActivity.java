package com.example.daiphongpc.gd3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_name,edit_age,edit_ađdr;
    Button btnSave;
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_layout);

        //Khai báo
        Student hienRau;

        //khởi tạO
        hienRau=new Student("Hiển Râu Quặp",28,"Hà Lội");
        txtShow=findViewById(R.id.txtShow);
        edit_name=findViewById(R.id.edt_name);
        edit_age=findViewById(R.id.edit_NXB2);
        edit_ađdr=findViewById(R.id.edit_SoBanPhatHanh2);
        btnSave=findViewById(R.id.btnSave1);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khi có ai ấn vào button thì sẽ gọi vào đây
                String inputText=edit_name.getText().toString();
                int inputAge=Integer.parseInt(edit_age.getText().toString());
                String inputAddr=edit_ađdr.getText().toString();
                Student inputStudent=new Student(inputText,inputAge,inputAddr);
                inputStudent.getStudentInf();
                String curentLog=txtShow.getText().toString();
                txtShow.setText(inputStudent.name+"-"+inputStudent.age+"-"+inputStudent.addr+"\n"+curentLog);
            }
        });



    }
}
