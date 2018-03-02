package com.jia.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R.Layout.activity_main.xml 화면을 정의한 XML을 화면에 보여준다.
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        // Intent : 새로운 액티비에게 정보를 전송(새로운 것을 구동)
        // this : 나(MainActivity), 상대:MenuActivity.class
        Intent intent = new Intent(this, MenuActivity.class);
        // 액티비티를 구동
        startActivity(intent);
    }
}
