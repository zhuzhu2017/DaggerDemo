package com.tongtong.daggerdemo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.tongtong.daggerdemo.R;
import com.tongtong.daggerdemo.component.DaggerSimpleInjectComponent;
import com.tongtong.daggerdemo.component.SimpleInjectComponent;
import com.tongtong.daggerdemo.entity.Cloth;
import com.tongtong.daggerdemo.entity.Shoe;
import com.tongtong.daggerdemo.module.SimpleInjectModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Dagger2的基础使用方法
 * ①创建引用对象（产品）
 * ②创建引用对象的获取对象（生产线）
 * ③创建接口实现Activity获取引用对象（供应商）
 * Created by allen on 2017/11/24.
 */

public class SimpleInjectActivity extends AppCompatActivity {
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
        //获取供应商接口
        SimpleInjectComponent simpleInjectComponent = DaggerSimpleInjectComponent.builder()
                .simpleInjectModule(new SimpleInjectModule())
                .build();
        //绑定Activity
        simpleInjectComponent.inject(this);
    }

    @OnClick(R.id.btn_create_obj)
    public void onViewClicked() {
        tvResult.setText(cloth + "和" + shoe);
    }
}
