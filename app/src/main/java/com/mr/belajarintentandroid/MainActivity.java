package com.mr.belajarintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit, btnPindah, btnTelpon, btnBrowser;
    private EditText etMasukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnPindah = (Button) findViewById(R.id.btn_pindah_halaman);
        btnTelpon = (Button) findViewById(R.id.btn_buka_telepon);
        btnBrowser = (Button) findViewById(R.id.btn_buka_browser);
        etMasukan = (EditText) findViewById(R.id.et_masukan);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputMasukan = etMasukan.getText().toString();
                Intent intentWithData = new Intent(MainActivity.this, ResultActivity.class);
                intentWithData.putExtra("data", inputMasukan);
                startActivity(intentWithData);
            }
        });

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityPindah.class));
            }
        });

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noTel = "081312345678";
                Intent intentTel = new Intent(Intent.ACTION_DIAL);
                intentTel.setData(Uri.fromParts("tel", noTel, null));
                startActivity(intentTel);
            }
        });

        btnBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlBrowser = "https://google.com/";
                Intent intentBrowser = new Intent(Intent.ACTION_VIEW);
                intentBrowser.setData(Uri.parse(urlBrowser));
                startActivity(intentBrowser);
            }
        });

    }
}