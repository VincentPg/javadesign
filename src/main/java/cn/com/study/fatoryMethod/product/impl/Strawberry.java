package cn.com.study.fatoryMethod.product.impl;


import cn.com.study.fatoryMethod.product.Fruit;

/**
 * 草莓
 */
public class Strawberry implements Fruit {

    @Override
    public void plant() {
        System.out.println("Strawberry.plant");
    }

    @Override
    public void grow() {
        System.out.println("Strawberry.grow");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry.harvest");
    }
}
