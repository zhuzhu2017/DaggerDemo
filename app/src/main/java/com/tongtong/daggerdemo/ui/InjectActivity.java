package com.tongtong.daggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.tongtong.daggerdemo.R;
import com.tongtong.daggerdemo.component.DaggerInjectComponent;
import com.tongtong.daggerdemo.component.InjectComponent;
import com.tongtong.daggerdemo.entity.Cloth;
import com.tongtong.daggerdemo.entity.Shoe;
import com.tongtong.daggerdemo.module.InjectModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by allen on 2017/11/24.
 */

public class InjectActivity extends AppCompatActivity {
    @BindView(R.id.btn_create_obj)
    Button btnCreateObj;
    @BindView(R.id.tv_result)
    TextView tvResult;

    @Inject
    Cloth cloth;
    @Inject
    Shoe shoe;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject);
        ButterKnife.bind(this);
        InjectComponent injectComponent = DaggerInjectComponent.builder().injectModule(new InjectModule()).build();
        injectComponent.inject(this);
    }

    @OnClick(R.id.btn_create_obj)
    public void onViewClicked() {
        tvResult.setText(cloth + "和" + shoe);
    }
}
