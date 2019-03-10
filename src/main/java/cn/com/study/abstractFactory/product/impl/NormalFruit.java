package cn.com.study.abstractFactory.product.impl;

import cn.com.study.abstractFactory.product.Fruit;

/**
 * 北方水果。
 * 实现水果接口，构成产品等级
 */
public class NormalFruit implements Fruit {
    private String name;

    public NormalFruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
