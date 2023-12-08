package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class QRCode_generate extends AppCompatActivity {
    private EditText editText;
    private Button buttonQRGenerate;
    private Button buttonGenerateBack;
    private ImageView imageView;

    public void init() {
        editText = findViewById(R.id.editText);
        buttonQRGenerate = findViewById(R.id.buttonQRGenerate);
        buttonGenerateBack = findViewById(R.id.buttonGenerateBack);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_generate);
        init();

        buttonQRGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonGenerateBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QRCode_generate.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}