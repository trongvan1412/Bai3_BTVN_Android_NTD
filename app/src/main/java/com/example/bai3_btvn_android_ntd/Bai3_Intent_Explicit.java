package com.example.bai3_btvn_android_ntd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai3_Intent_Explicit extends AppCompatActivity {

    EditText etName,etPhone,etAddress;
    Button btnAgree;

    String name,phone,address;

    private static final String KEY_NAME_INTENT = "name";
    private static final String KEY_ADDRESS_INTENT = "address";
    private static final String KEY_PHONE_INTENT = "phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3__intent__explicit);
        setWidget();

        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agree();
            }
        });
    }

    private void agree() {
        name = etName.getText().toString();
        phone = etPhone.getText().toString();
        address = etAddress.getText().toString();

        if(name.isEmpty()){
            Toast.makeText(this, "Bạn chưa điền tên.", Toast.LENGTH_SHORT).show();
            etName.requestFocus();
        }else if(address.isEmpty()){
            Toast.makeText(this, "Bạn chưa điền địa chỉ.", Toast.LENGTH_SHORT).show();
            etAddress.requestFocus();
        }else if(phone.isEmpty() || phone.length() != 10){
            Toast.makeText(this, "Số điện thoại không hợp lệ.", Toast.LENGTH_SHORT).show();
        }else{
            Intent i = new Intent(Bai3_Intent_Explicit.this,InformationDetails.class);

            i.putExtra(KEY_NAME_INTENT,name);
            i.putExtra(KEY_ADDRESS_INTENT,address);
            i.putExtra(KEY_PHONE_INTENT,phone);

            startActivity(i);
        }
    }

    private void setWidget() {
        btnAgree = (Button) findViewById(R.id.btn_agree);
        etName = (EditText) findViewById(R.id.et_name);
        etPhone = (EditText) findViewById(R.id.et_tel);
        etAddress = (EditText) findViewById(R.id.et_address);
    }
}
