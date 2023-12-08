package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

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
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try {
                    if (editText.getText().toString().isEmpty()) {
                        Toast.makeText(QRCode_generate.this,
                                "Nem lehet üres a QRCode adat", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    BitMatrix bitMatrix = multiFormatWriter.encode(editText.getText().toString(),
                            BarcodeFormat.QR_CODE, 500, 500);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    imageView.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
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