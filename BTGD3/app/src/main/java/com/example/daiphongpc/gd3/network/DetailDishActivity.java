package com.example.daiphongpc.gd3.network;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class DetailDishActivity extends AppCompatActivity {
    EditText edit_Name;
    TextView txtPrice,txtUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_dish);
        addControls();
        edit_Name.setSelection(edit_Name.getText().length());
        edit_Name.requestFocus();
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    private void addControls() {
        edit_Name=findViewById(R.id.edit_Name);

        txtPrice=findViewById(R.id.txt_pricere);
        txtUnit=findViewById(R.id.txt_unit);
        InventoryItem inventoryItem= (InventoryItem) getIntent().getSerializableExtra("inventory");
        ArrayList<Unit> arrUnit= (ArrayList<Unit>) getIntent().getSerializableExtra("arrunit");
 //       String name=getIntent().getStringExtra("inventory");
        Log.d("dulieukt", "addControls: "+inventoryItem);
        edit_Name.setText(inventoryItem.getInventoryItemName());
        txtPrice.setText(inventoryItem.getPrice()+"");

        for (int i = 0; i <arrUnit.size() ; i++) {
            if (arrUnit.get(i).getUnitID().equals(inventoryItem.getUnitID())){
                txtUnit.setText(arrUnit.get(i).getUnitName());
            }
        }
    }

    public void xuLyCat(View view) {
        String tenMon=edit_Name.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("tenmon",tenMon);
        int index=getIntent().getIntExtra("index",0);
        intent.putExtra("pos",index);
        setResult(114,intent);
        finish();
    }
}
