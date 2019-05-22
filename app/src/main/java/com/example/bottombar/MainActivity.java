package com.example.bottombar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bottombar.fragment.Fragment1;
import com.example.bottombar.fragment.Fragment2;
import com.example.bottombar.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(Fragment1.class,
                        "首页",
                        R.drawable.cre_icon1,
                        R.drawable.cre_icon4)
                .addItem(Fragment2.class,
                        "订单",
                        R.drawable.cre_icon2,
                        R.drawable.cre_icon5)
                .addItem(Fragment3.class,
                        "我的",
                        R.drawable.cre_icon3,
                        R.drawable.cre_icon6)
                .build();
    }
}
