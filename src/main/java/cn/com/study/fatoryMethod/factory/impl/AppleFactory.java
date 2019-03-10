package cn.com.study.fatoryMethod.factory.impl;

import cn.com.study.fatoryMethod.factory.FruitFactory;
import cn.com.study.fatoryMethod.product.Fruit;
import cn.com.study.fatoryMethod.product.impl.Apple;

public class AppleFactory implements FruitFactory {
    @Override
    public Fruit factory() {
        return new Apple();

    }
}
