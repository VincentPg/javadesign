package cn.com.study.simpleFactory;

import cn.com.study.simpleFactory.factory.FruitFactory;
import cn.com.study.simpleFactory.product.Fruit;

public class Client {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.factory("apple");
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}
