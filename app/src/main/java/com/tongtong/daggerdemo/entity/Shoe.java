package com.tongtong.daggerdemo.entity;

import javax.inject.Inject;

/**
 * 产品鞋子
 * Created by allen on 2017/11/24.
 */

public class Shoe {
    /**
     * 这种方法仅使用于自己项目中创建的引用对象，
     * 第三方jar包中的对象类是不能够使用这种方法的
     */
    @Inject
    public Shoe() {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
