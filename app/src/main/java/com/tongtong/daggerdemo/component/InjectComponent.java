package com.tongtong.daggerdemo.component;

import com.tongtong.daggerdemo.module.InjectModule;
import com.tongtong.daggerdemo.ui.CustomInjectActivity;
import com.tongtong.daggerdemo.ui.RelavantInjectActivity;
import com.tongtong.daggerdemo.ui.SimpleInjectActivity;

import dagger.Component;

/**
 * 相当于供应商
 * Created by allen on 2017/11/24.
 */
@Component(modules = InjectModule.class)
public interface InjectComponent {
    void inject(SimpleInjectActivity simpleInjectActivity);

    void inject(RelavantInjectActivity relavantInjectActivity);

    void inject(CustomInjectActivity customInjectActivity);
}
