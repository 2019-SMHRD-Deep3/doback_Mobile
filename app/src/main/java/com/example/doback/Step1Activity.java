package com.example.doback;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step1Activity extends AppCompatActivity {

    /*Button bnt_c01, bnt_c02, bnt_c03, bnt_c04, bnt_c05, bnt_c06, bnt_c07, bnt_c08, bnt_c09, bnt_c10,
            bnt_c11, bnt_c12, bnt_c13, bnt_c14, bnt_v01, bnt_v02, bnt_v03, bnt_v04, bnt_v05, bnt_v06,
            bnt_v07, bnt_v08, bnt_v09, bnt_v10;*/

    Button btn_c[] = new Button[14];
    Button btn_v[] = new Button[10];
    String con[] = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
    String vow[] = {"ㅏ", "ㅑ", "ㅓ", "ㅕ", "ㅗ", "ㅛ", "ㅜ", "ㅠ", "ㅡ", "ㅣ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("초급 단계");
        actionBar.setDisplayHomeAsUpEnabled(true);

        for (int i = 0; i < 14; i++) {
            int resId = getResources().getIdentifier("btn_c"+i, "id", getApplicationContext().getPackageName());
            btn_c[i] = findViewById(resId);
            btn_c[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
        for (int i = 0; i < 10; i++) {
            int resId = getResources().getIdentifier("btn_v"+i, "id", getApplicationContext().getPackageName());
            btn_v[i] = findViewById(resId);
        }

        /*for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 10; j++) {
                btn_c[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
            }
        }*/


    }
}
