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
import com.tongtong.daggerdemo.entity.Clothes;
import com.tongtong.daggerdemo.inject.RedCloth;
import com.tongtong.daggerdemo.module.InjectModule;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Named和Qualifier使用
 * Created by allen on 2017/11/25.
 */

public class CustomInjectActivity extends AppCompatActivity {
    @BindView(R.id.btn_create_obj)
    Button btnCreateObj;
    @BindView(R.id.tv_result)
    TextView tvResult;

    @Inject
    Cloth cloth;
    @Inject
    @Named("blue")
    Cloth blueCloth;
    @Inject
    @RedCloth
    Cloth redCloth;
    @Inject
    Clothes blueClothes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        ButterKnife.bind(this);
        InjectComponent injectComponent = DaggerInjectComponent.builder()
                .injectModule(new InjectModule())
                .build();
        injectComponent.inject(this);
    }

    @OnClick(R.id.btn_create_obj)
    public void onViewClicked() {
        tvResult.setText(cloth + "\n" + blueCloth + "\n" + redCloth + "\n做了一件" + blueClothes);
    }
}
