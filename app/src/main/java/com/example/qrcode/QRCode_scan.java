package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QRCode_scan extends AppCompatActivity {
    private Button buttonQRScan;
    private Button buttonScanBack;
    private TextView textView;

    public void init() {
        buttonQRScan = findViewById(R.id.buttonQRScan);
        buttonScanBack = findViewById(R.id.buttonScanBack);
        textView = findViewById(R.id.textView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_scan);
        init();

        buttonQRScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonScanBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QRCode_scan.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}