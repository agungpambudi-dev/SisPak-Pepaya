package com.example.pakarpepaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView ivData, ivHelp, ivDiagnose, ivAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle(getString(R.string.app_name));
        getSupportActionBar().setElevation(0);

        ivData = findViewById(R.id.iv_data);
        ivHelp = findViewById(R.id.iv_help);
        ivDiagnose = findViewById(R.id.iv_diagnose);
        ivAbout = findViewById(R.id.iv_about);

        ivDiagnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KonsultasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
