package cn.com.study.abstractFactory.factory;

import cn.com.study.abstractFactory.product.Fruit;
import cn.com.study.abstractFactory.product.Veggie;

/**
 * 园丁工厂接口
 * 注：此处使用空接口来标识。
 */
public interface GardenerFactory {
    public Fruit createFruit(String name);

    public Veggie createVeggie(String name);
}
