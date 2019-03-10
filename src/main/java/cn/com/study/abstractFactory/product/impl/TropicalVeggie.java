package cn.com.study.abstractFactory.product.impl;

import cn.com.study.abstractFactory.product.Veggie;

/**
 * 热带蔬菜
 * 实现蔬菜接口，构成产品等级。
 */
public class TropicalVeggie implements Veggie {
    private String name;

    public TropicalVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
