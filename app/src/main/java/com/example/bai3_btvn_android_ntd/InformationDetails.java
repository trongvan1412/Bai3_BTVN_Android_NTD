package com.example.bai3_btvn_android_ntd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationDetails extends AppCompatActivity {

    TextView tvInfoDetails;
    private static final String KEY_NAME_INTENT = "name";
    private static final String KEY_ADDRESS_INTENT = "address";
    private static final String KEY_PHONE_INTENT = "phone";
    String rName,rAddress,rPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_details);

        tvInfoDetails = (TextView) findViewById(R.id.tv_info_details);

        rName = getIntent().getStringExtra(KEY_NAME_INTENT);
        rAddress = getIntent().getStringExtra(KEY_ADDRESS_INTENT);
        rPhone = getIntent().getStringExtra(KEY_PHONE_INTENT);

        tvInfoDetails.setText(rName + "\n" + rAddress +"\n"+ rPhone);
    }
}
