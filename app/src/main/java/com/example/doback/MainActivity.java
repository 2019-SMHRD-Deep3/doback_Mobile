package com.example.doback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.doback.fragment.Fragment1;
import com.example.doback.fragment.Fragment2;
import com.example.doback.fragment.Fragment3;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.tab1:
                                Toast.makeText(getApplicationContext(), "첫 번째 탭 선택", Toast.LENGTH_SHORT).show();
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

                                return true;
                            case R.id.tab2:
                                Toast.makeText(getApplicationContext(), "두 번째 탭 선택", Toast.LENGTH_SHORT).show();
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();

                                return true;
                            case R.id.tab3:
                                Toast.makeText(getApplicationContext(), "세 번째 탭 선택", Toast.LENGTH_SHORT).show();
                                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();

                                return true;
                        }
                        return false;
                    }
                }
        );
    }
}
