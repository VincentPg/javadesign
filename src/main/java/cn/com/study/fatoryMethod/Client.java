package cn.com.study.fatoryMethod;

import cn.com.study.fatoryMethod.factory.FruitFactory;
import cn.com.study.fatoryMethod.factory.impl.AppleFactory;
import cn.com.study.fatoryMethod.product.Fruit;

public class Client {
    public static void main(String[] args) {
        //构建水果工厂指向苹果工厂实例
        FruitFactory fruitFactory = new AppleFactory();
        //构建水果
        Fruit apple=fruitFactory.factory();
        apple.plant();
        apple.grow();
        apple.harvest();

    }
}
