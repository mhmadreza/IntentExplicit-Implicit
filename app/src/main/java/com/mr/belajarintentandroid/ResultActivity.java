package com.mr.belajarintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private TextView tvInputMasukan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setupUI();
    }

    private void setupUI() {
        /* Untuk menampilkan Arrow Back/Kembali di Action Bar */
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvInputMasukan = (TextView) findViewById(R.id.tv_input_masukan);
        Intent intentWD = getIntent();
        Bundle bundle = intentWD.getExtras();

        /* Pengecekan agar tidak ada BUG */
        if (bundle != null) {
            String data = (String) bundle.get("data");
            tvInputMasukan.setText(data);
        } else {
            Toast.makeText(ResultActivity.this, "Tetot ! Error Bro !", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}