package com.tongtong.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tongtong.daggerdemo.ui.CustomInjectActivity;
import com.tongtong.daggerdemo.ui.RelavantInjectActivity;
import com.tongtong.daggerdemo.ui.SimpleInjectActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_inject)
    Button btnInject;
    @BindView(R.id.btn_inject_relavant)
    Button btnInjectRelavant;
    @BindView(R.id.btn_inject_custom)
    Button btnInjectCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_inject, R.id.btn_inject_relavant, R.id.btn_inject_custom})
    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_inject:
                intent = new Intent(this, SimpleInjectActivity.class);
                break;
            case R.id.btn_inject_relavant:
                intent = new Intent(this, RelavantInjectActivity.class);
                break;
            case R.id.btn_inject_custom:
                intent = new Intent(this, CustomInjectActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
