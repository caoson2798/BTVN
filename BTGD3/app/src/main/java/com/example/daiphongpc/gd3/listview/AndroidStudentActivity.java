package com.example.daiphongpc.gd3.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class AndroidStudentActivity extends AppCompatActivity {
    ListView lv;
    Button btnSave,btnUpdate,btnDel;
    EditText editName,editPhoneNumber, editAddress, edit_ID;
    ArrayList<AndroidStudent> arrData=new ArrayList<>();
    AndroidStudentAdapter adapter;

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_student);
        addControls();
        addEvents();
    }

    private void addEvents() {

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionAdd();
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                i=position;
                AndroidStudent student=arrData.get(position);
                edit_ID.setText(student.getId()+"");
                editName.setText(student.getName());
                editAddress.setText(student.getAddr());
                editPhoneNumber.setText(student.getPhoneName());

                adapter.notifyDataSetChanged();
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidStudent student=arrData.get(i);
                student.setId(Integer.parseInt(edit_ID.getText().toString()));
                student.setName(editName.getText().toString());
                student.setAddr(editAddress.getText().toString());
                student.setPhoneName(editPhoneNumber.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrData.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
    }
    //swip listview to delete

    private void actionAdd() {
        String name=editName.getText().toString();
        String addr=editAddress.getText().toString();
        int id=Integer.parseInt(edit_ID.getText().toString());
        String phoneNumber=editPhoneNumber.getText().toString();

        arrData.add(new AndroidStudent(id,name,addr,phoneNumber));
        Log.d("soncao",arrData.size()+"\n"+arrData.toString());
        adapter.notifyDataSetChanged();

    }

    private void addControls() {
        lv=findViewById(R.id.lv_stu);
        btnUpdate=findViewById(R.id.btn_update);
        btnSave=findViewById(R.id.btn_save11);
        btnDel=findViewById(R.id.btn_del);
        edit_ID=findViewById(R.id.edit_id);
        editAddress=findViewById(R.id.edit_adress);
        editName=findViewById(R.id.edit_name);
        editPhoneNumber=findViewById(R.id.edit_numberPhone);
        adapter=new AndroidStudentAdapter(arrData,this);
        lv.setAdapter(adapter);

    }
}
