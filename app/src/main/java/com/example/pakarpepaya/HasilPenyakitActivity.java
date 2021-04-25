package com.example.pakarpepaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilPenyakitActivity extends AppCompatActivity {

    TextView tvPenyakit;

    public static final String PENYAKIT = "penyakit";
    String hasilPenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_penyakit);

        tvPenyakit = findViewById(R.id.tv_penyakit);

        hasilPenyakit = getIntent().getStringExtra(PENYAKIT);

        assert hasilPenyakit != null;
        if (hasilPenyakit.equals("p01")){
            tvPenyakit.setText(getString(R.string.P01A));
        } else if (hasilPenyakit.equals("p02")){
            tvPenyakit.setText(getString(R.string.P02A));
        } else if (hasilPenyakit.equals("p03")){
            tvPenyakit.setText(getString(R.string.P03A));
        } else if (hasilPenyakit.equals("p04")){
            tvPenyakit.setText(getString(R.string.P04A));
        } else if (hasilPenyakit.equals("p05")){
            tvPenyakit.setText(getString(R.string.P05A));
        } else if (hasilPenyakit.equals("p06")){
            tvPenyakit.setText(getString(R.string.P06A));
        } else if (hasilPenyakit.equals("p07")){
            tvPenyakit.setText(getString(R.string.P07A));
        } else if (hasilPenyakit.equals("p08")){
            tvPenyakit.setText(getString(R.string.P08A));
        } else if (hasilPenyakit.equals("p09")){
            tvPenyakit.setText(getString(R.string.P09A));
        } else {
            tvPenyakit.setText(getString(R.string.P00));
        }

    }
}
