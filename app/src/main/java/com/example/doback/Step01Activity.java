package com.example.doback;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Step01Activity extends AppCompatActivity {
    Button btnGiyeok, btnNieun, btnDigeut, btnRieul, btnMieum, btnBieup, btnSiot;
    Button btnIeung, btnJieut, btnChieut, btnKhieuk, btnTieut, btnPieup,btnHieut ;
    Button btnGa, btnGya, btnGeo, btnGyeo, btnGo;
    Button btnGyo, btnGu, btnGyu, btnGeu, btnGi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step01);

        btnGiyeok = findViewById(R.id.btnGiyeok);
        btnNieun = findViewById(R.id.btnNieun);
        btnDigeut = findViewById(R.id.btnDigeut);
        btnRieul = findViewById(R.id.btnRieul);
        btnMieum = findViewById(R.id.btnMieum);
        btnBieup = findViewById(R.id.btnBieup);
        btnSiot = findViewById(R.id.btnSiot);
        btnIeung = findViewById(R.id.btnIeung);
        btnJieut = findViewById(R.id.btnJieut);
        btnChieut = findViewById(R.id.btnChieut);
        btnKhieuk = findViewById(R.id.btnKhieuk);
        btnTieut = findViewById(R.id.btnTieut);
        btnPieup = findViewById(R.id.btnPieup);
        btnHieut = findViewById(R.id.btnHieut);

        btnGa = findViewById(R.id.btnGa);
        btnGya = findViewById(R.id.btnGya);
        btnGeo = findViewById(R.id.btnGeo);
        btnGyeo = findViewById(R.id.btnGyeo);
        btnGo = findViewById(R.id.btnGo);
        btnGyo = findViewById(R.id.btnGyo);
        btnGu = findViewById(R.id.btnGu);
        btnGyu = findViewById(R.id.btnGyu);
        btnGeu = findViewById(R.id.btnGeu);
        btnGi = findViewById(R.id.btnGi);


        btnNieun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("나");
                btnGya.setText("냐");
                btnGeo.setText("너");
                btnGyeo.setText("녀");
                btnGo.setText("노");
                btnGyo.setText("뇨");
                btnGu.setText("누");
                btnGyu.setText("뉴");
                btnGeu.setText("느");
                btnGi.setText("니");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnGiyeok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("가");
                btnGya.setText("갸");
                btnGeo.setText("거");
                btnGyeo.setText("겨");
                btnGo.setText("고");
                btnGyo.setText("교");
                btnGu.setText("구");
                btnGyu.setText("규");
                btnGeu.setText("그");
                btnGi.setText("기");
                btnNieun.setBackgroundColor(Color.LTGRAY);
                btnGiyeok.setBackgroundColor(0000);

            }
        });

        btnDigeut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("다");
                btnGya.setText("댜");
                btnGeo.setText("더");
                btnGyeo.setText("뎌");
                btnGo.setText("도");
                btnGyo.setText("됴");
                btnGu.setText("두");
                btnGyu.setText("듀");
                btnGeu.setText("드");
                btnGi.setText("디");
                btnNieun.setBackgroundColor(0000);
            }
        });

        btnRieul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("라");
                btnGya.setText("랴");
                btnGeo.setText("러");
                btnGyeo.setText("려");
                btnGo.setText("로");
                btnGyo.setText("료");
                btnGu.setText("루");
                btnGyu.setText("류");
                btnGeu.setText("르");
                btnGi.setText("리");
                btnNieun.setBackgroundColor(0000);
            }
        });

        btnMieum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("마");
                btnGya.setText("먀");
                btnGeo.setText("머");
                btnGyeo.setText("며");
                btnGo.setText("모");
                btnGyo.setText("묘");
                btnGu.setText("무");
                btnGyu.setText("뮤");
                btnGeu.setText("므");
                btnGi.setText("미");
                btnNieun.setBackgroundColor(0000);
            }
        });

        btnBieup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("바");
                btnGya.setText("뱌");
                btnGeo.setText("버");
                btnGyeo.setText("벼");
                btnGo.setText("보");
                btnGyo.setText("뵤");
                btnGu.setText("부");
                btnGyu.setText("뷰");
                btnGeu.setText("브");
                btnGi.setText("비");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnSiot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("사");
                btnGya.setText("샤");
                btnGeo.setText("서");
                btnGyeo.setText("셔");
                btnGo.setText("소");
                btnGyo.setText("쇼");
                btnGu.setText("수");
                btnGyu.setText("슈");
                btnGeu.setText("스");
                btnGi.setText("시");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnIeung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("아");
                btnGya.setText("야");
                btnGeo.setText("어");
                btnGyeo.setText("여");
                btnGo.setText("오");
                btnGyo.setText("요");
                btnGu.setText("우");
                btnGyu.setText("유");
                btnGeu.setText("으");
                btnGi.setText("이");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnJieut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("자");
                btnGya.setText("쟈");
                btnGeo.setText("저");
                btnGyeo.setText("져");
                btnGo.setText("조");
                btnGyo.setText("죠");
                btnGu.setText("주");
                btnGyu.setText("쥬");
                btnGeu.setText("즈");
                btnGi.setText("지");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnChieut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("차");
                btnGya.setText("챠");
                btnGeo.setText("처");
                btnGyeo.setText("쳐");
                btnGo.setText("초");
                btnGyo.setText("쵸");
                btnGu.setText("추");
                btnGyu.setText("츄");
                btnGeu.setText("츠");
                btnGi.setText("치");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnKhieuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("카");
                btnGya.setText("캬");
                btnGeo.setText("커");
                btnGyeo.setText("켜");
                btnGo.setText("코");
                btnGyo.setText("쿄");
                btnGu.setText("쿠");
                btnGyu.setText("큐");
                btnGeu.setText("크");
                btnGi.setText("키");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnTieut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("타");
                btnGya.setText("탸");
                btnGeo.setText("터");
                btnGyeo.setText("텨");
                btnGo.setText("토");
                btnGyo.setText("툐");
                btnGu.setText("투");
                btnGyu.setText("튜");
                btnGeu.setText("트");
                btnGi.setText("티");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnPieup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("파");
                btnGya.setText("퍄");
                btnGeo.setText("퍼");
                btnGyeo.setText("펴");
                btnGo.setText("포");
                btnGyo.setText("표");
                btnGu.setText("푸");
                btnGyu.setText("퓨");
                btnGeu.setText("프");
                btnGi.setText("피");
                btnNieun.setBackgroundColor(0000);
            }
        });
        btnHieut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnGa.setText("하");
                btnGya.setText("햐");
                btnGeo.setText("허");
                btnGyeo.setText("혀");
                btnGo.setText("호");
                btnGyo.setText("효");
                btnGu.setText("후");
                btnGyu.setText("휴");
                btnGeu.setText("흐");
                btnGi.setText("히");
                btnNieun.setBackgroundColor(0000);
            }
        });
    }
}
