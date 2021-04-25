package com.example.pakarpepaya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KonsultasiActivity extends AppCompatActivity {

    TextView tvGejala;
    Button btYa, btTidak;
    String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);

        tvGejala = findViewById(R.id.tv_gejala);
        btYa = findViewById(R.id.bt_ya);
        btTidak = findViewById(R.id.bt_tidak);


        code = "G02";

        btYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code.equals("G02")){
                    tvGejala.setText(getString(R.string.G02A));
                    code = "G03";
                } else if (code.equals("G03")){
                    tvGejala.setText(getString(R.string.G03A));
                    code = "G04";
                } else if (code.equals("G04")){
                    tvGejala.setText(getString(R.string.G04A));
                    code = "G04A";
                } else if (code.equals("G04A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p01");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G13")){
                    tvGejala.setText(getString(R.string.G14A));
                    code = "G14";
                } else if (code.equals("G14")){
                    tvGejala.setText(getString(R.string.G15A));
                    code = "G15";
                } else if (code.equals("G15")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p05");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G05")){
                    tvGejala.setText(getString(R.string.G06A));
                    code = "G06";
                } else if (code.equals("G06")){
                    tvGejala.setText(getString(R.string.G07A));
                    code = "G07A";
                } else if (code.equals("G07A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p02");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G08")){
                    tvGejala.setText(getString(R.string.G09A));
                    code = "G09";
                } else if (code.equals("G09")){
                    tvGejala.setText(getString(R.string.G10A));
                    code = "G10A";
                } else if (code.equals("G10A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p03");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G11")){
                    tvGejala.setText(getString(R.string.G12A));
                    code = "G12A";
                } else if (code.equals("G12A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p04");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G16")){
                    tvGejala.setText(getString(R.string.G17A));
                    code = "G17";
                } else if (code.equals("G17")){
                    tvGejala.setText(getString(R.string.G18A));
                    code = "G18";
                } else if (code.equals("G18")){
                    tvGejala.setText(getString(R.string.G19A));
                    code = "G19A";
                } else if (code.equals("G19A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p06");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G20")){
                    tvGejala.setText(getString(R.string.G21A));
                    code = "G21A";
                } else if (code.equals("G21A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p07");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G22")){
                    tvGejala.setText(getString(R.string.G23A));
                    code = "G23";
                } else if (code.equals("G23")){
                    tvGejala.setText(getString(R.string.G24A));
                    code = "G24";
                } else if (code.equals("G24")){
                    tvGejala.setText(getString(R.string.G25A));
                    code = "G25A";
                } else if (code.equals("G25A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p08");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G26")){
                    tvGejala.setText(getString(R.string.G27A));
                    code = "G27A";
                } else if (code.equals("G27A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p09");
                    startActivity(intent);
                    finish();
                }
            }
        });

        btTidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code.equals("G02")){
                    tvGejala.setText(getString(R.string.G13A));
                    code = "G13";
                } else if (code.equals("G13")){
                    tvGejala.setText(getString(R.string.G05A));
                    code = "G05";
                } else if (code.equals("G05")){
                    tvGejala.setText(getString(R.string.G08A));
                    code = "G08";
                } else if (code.equals("G08")){
                    tvGejala.setText(getString(R.string.G11A));
                    code = "G11";
                } else if (code.equals("G11")){
                    tvGejala.setText(getString(R.string.G16A));
                    code = "G16";
                } else if (code.equals("G16")){
                    tvGejala.setText(getString(R.string.G20A));
                    code = "G20";
                } else if (code.equals("G20")){
                    tvGejala.setText(getString(R.string.G22A));
                    code = "G22";
                } else if (code.equals("G22")){
                    tvGejala.setText(getString(R.string.G26A));
                    code = "G26";
                }  else if (code.equals("G04")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p01");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G15")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p05");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G19")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p06");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G25")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p08");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G04A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p01");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G15A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p05");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G19A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p06");
                    startActivity(intent);
                    finish();
                } else if (code.equals("G25A")){
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p08");
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(KonsultasiActivity.this, HasilPenyakitActivity.class);
                    intent.putExtra(HasilPenyakitActivity.PENYAKIT, "p00");
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
}
