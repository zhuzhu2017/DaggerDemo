package com.tongtong.daggerdemo.component;

import com.tongtong.daggerdemo.module.SimpleInjectModule;
import com.tongtong.daggerdemo.ui.SimpleInjectActivity;

import dagger.Component;

/**
 * 相当于供应商
 * Created by allen on 2017/11/24.
 */
@Component(modules = SimpleInjectModule.class)
public interface SimpleInjectComponent {
    void inject(SimpleInjectActivity simpleInjectActivity);
}
