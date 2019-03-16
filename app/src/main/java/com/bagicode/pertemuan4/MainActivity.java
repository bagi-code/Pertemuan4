package com.bagicode.pertemuan4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // inisialisasai awal
    private Button btnPointA_1;
    private Button btnPointA_2;
    private Button btnPointA_3;
    private TextView tvScoreA;

    private int scoreA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi valuenya
        tvScoreA = findViewById(R.id.tv_score_a);
        btnPointA_1 = findViewById(R.id.btn_point_a_1);
        btnPointA_2 = findViewById(R.id.btn_point_a_2);
        btnPointA_3 = findViewById(R.id.btn_point_a_3);

        btnPointA_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+1;
                tvScoreA.setText(String.valueOf(scoreA));
            }
        });

        btnPointA_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+2;
                tvScoreA.setText(""+scoreA);
            }
        });

        btnPointA_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+3;
                tvScoreA.setText(""+scoreA);
            }
        });
    }
}
