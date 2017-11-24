package com.tongtong.daggerdemo.entity;

import javax.inject.Inject;

/**
 * 产品鞋子
 * Created by allen on 2017/11/24.
 */

public class Shoe {
    @Inject
    public Shoe() {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
