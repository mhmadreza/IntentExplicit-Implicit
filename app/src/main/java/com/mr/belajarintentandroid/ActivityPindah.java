package com.mr.belajarintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityPindah extends AppCompatActivity {

    private TextView tvCopyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah);
        setupUI();
    }

    private void setupUI() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvCopyright = (TextView)findViewById(R.id.tv_cr_pindah);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}