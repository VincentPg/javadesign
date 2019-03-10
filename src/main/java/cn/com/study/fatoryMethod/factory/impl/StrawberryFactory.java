package cn.com.study.fatoryMethod.factory.impl;

import cn.com.study.fatoryMethod.factory.FruitFactory;
import cn.com.study.fatoryMethod.product.Fruit;
import cn.com.study.fatoryMethod.product.impl.Strawberry;

public class StrawberryFactory implements FruitFactory {
    @Override
    public Fruit factory() {
        return new Strawberry();
    }
}
