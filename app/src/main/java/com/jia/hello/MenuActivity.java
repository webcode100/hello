package com.jia.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void backButtonClicked(View view) {
        // Toast. 어떠한 글자를 화면에 일정기간동안 보여줌. 45, 30초
        // LENGTH_SHORT : 15초
        Toast.makeText(this, "백버튼이 눌림", Toast.LENGTH_LONG).show();
        // 종료
        finish();
    }
}
