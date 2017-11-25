package com.tongtong.daggerdemo.module;

import com.tongtong.daggerdemo.entity.Cloth;
import com.tongtong.daggerdemo.entity.Clothes;
import com.tongtong.daggerdemo.inject.RedCloth;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * InjectActivity 的module类来提供Cloth对象，相当于生产线
 * Created by allen on 2017/11/24.
 * 说明：@Module表明该类是Module类,这样Dagger2才能识别,
 * 而@Provides的作用是声明Module类中哪些方法是用来提供依赖对象的,
 * 当Component类需要依赖对象时,他就会根据返回值的类型来在有@Provides注解的方法中选择调用哪个方法.
 * <p>
 * 步骤1：查找Module中是否存在创建该类的方法。
 * 步骤2：若存在创建类方法，查看该方法是否存在参数
 * 步骤2.1：若存在参数，则按从步骤1开始依次初始化每个参数
 * 步骤2.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
 * 步骤3：若不存在创建类方法，则查找Inject注解的构造函数，看构造函数是否存在参数
 * 步骤3.1：若存在参数，则从步骤1开始依次初始化每个参数
 * 步骤3.2：若不存在参数，则直接初始化该类实例，一次依赖注入到此结束
 */
@Module
public class InjectModule {
    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    @RedCloth
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    /**
     * 带有参数的方法会自动获取参数对象
     *
     * @param cloth
     * @return
     */
//    @Provides
//    public Clothes getClothes(Cloth cloth) {
//        return new Clothes(cloth);
//    }

}
