package com.tongtong.daggerdemo.module;

import com.tongtong.daggerdemo.entity.Cloth;

import dagger.Module;
import dagger.Provides;

/**
 * InjectActivity 的module类来提供Cloth对象，相当于生产线
 * Created by allen on 2017/11/24.
 * 说明：@Module表明该类是Module类,这样Dagger2才能识别,
 * 而@Provides的作用是声明Module类中哪些方法是用来提供依赖对象的,
 * 当Component类需要依赖对象时,他就会根据返回值的类型来在有@Provides注解的方法中选择调用哪个方法.
 */
@Module
public class InjectModule {
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }
}
