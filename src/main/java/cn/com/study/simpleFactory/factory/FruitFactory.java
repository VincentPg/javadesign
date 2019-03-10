package cn.com.study.simpleFactory.factory;

import cn.com.study.simpleFactory.product.Fruit;
import cn.com.study.simpleFactory.product.impl.Apple;
import cn.com.study.simpleFactory.product.impl.Grape;
import cn.com.study.simpleFactory.product.impl.Strawberry;

/**
 * 水果工厂：根据要求提供对应的水果。
 */
public class FruitFactory {
    public static Fruit factory(String fruitType){
        if("apple".equalsIgnoreCase(fruitType)){
            return new Apple();
        }else if("grape".equalsIgnoreCase(fruitType)){
            return new Grape();
        }else if("strawberry".equalsIgnoreCase(fruitType)){
            return new Strawberry();
        }else{
            return null;
        }
    }
}
