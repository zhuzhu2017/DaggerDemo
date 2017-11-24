package com.tongtong.daggerdemo.component;

import com.tongtong.daggerdemo.module.InjectModule;
import com.tongtong.daggerdemo.ui.InjectActivity;

import dagger.Component;

/**
 * 相当于供应商
 * Created by allen on 2017/11/24.
 */
@Component(modules = InjectModule.class)
public interface InjectComponent {
    void inject(InjectActivity injectActivity);
}
