package com.tongtong.daggerdemo.entity;

/**
 * 布料类（准备在InjectActivity中引用该类）
 * Created by allen on 2017/11/24.
 * 说明：相当于产品
 */

public class Cloth {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "我有一块" + color + "的布料";
    }
}
