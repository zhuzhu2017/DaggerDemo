package com.tongtong.daggerdemo.entity;

/**
 * 产品：衣服，需要依赖布料类
 * Created by allen on 2017/11/24.
 */

public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "的衣服";
    }
}
