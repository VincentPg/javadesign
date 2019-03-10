package cn.com.study.abstractFactory.factory.impl;

import cn.com.study.abstractFactory.factory.GardenerFactory;
import cn.com.study.abstractFactory.product.Fruit;
import cn.com.study.abstractFactory.product.Veggie;
import cn.com.study.abstractFactory.product.impl.TropicalFruit;
import cn.com.study.abstractFactory.product.impl.TropicalVeggie;

public class TropicalGardenerFactory implements GardenerFactory {
    /**
     * 水果的工厂方法
     * @param name
     * @return
     */
    public Fruit createFruit(String name){
        System.out.println("TropicalGardenerFactory.createFruit:"+name);
        return new TropicalFruit(name);
    }

    /**
     * 蔬菜的工厂方法
     * @param name
     * @return
     */
    public Veggie createVeggie(String name){
        System.out.println("TropicalGardenerFactory.createVeggie:"+name);
        return new TropicalVeggie(name);
    }
}
