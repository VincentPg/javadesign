package cn.com.study.abstractFactory.factory.impl;

import cn.com.study.abstractFactory.factory.GardenerFactory;
import cn.com.study.abstractFactory.product.Fruit;
import cn.com.study.abstractFactory.product.Veggie;
import cn.com.study.abstractFactory.product.impl.NormalFruit;
import cn.com.study.abstractFactory.product.impl.NormalVeggie;

/**
 * 北方园丁工厂类
 *  实现园丁工厂类，用于产生北方水果、蔬菜的实体。
 *
 */
public class NorthernGardenerFactory implements GardenerFactory {
    /**
     * 水果的工厂方法
     * @param name
     * @return
     */
    public Fruit createFruit(String name){
        System.out.println("NorthernGardenerFactory.createFruit:"+name);
        return new NormalFruit(name);
    }

    /**
     * 蔬菜的工厂方法
     * @param name
     * @return
     */
    public Veggie createVeggie(String name){
        System.out.println("NorthernGardenerFactory.createVeggie:"+name);
        return new NormalVeggie(name);
    }
}
