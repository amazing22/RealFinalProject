package com.example.user.finalproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// 회원가입창
public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("회원가입");
        setContentView(R.layout.activity_main3);

        Button btn1 = (Button)findViewById(R.id.sign);
        btn1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
