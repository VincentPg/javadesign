package cn.com.study.fatoryMethod.product.impl;


import cn.com.study.fatoryMethod.product.Fruit;

/**
 * 苹果
 */
public class Apple implements Fruit {
    /**树龄**/
    public int treeAge;

    @Override
    public void plant() {
        System.out.println("Apple.plant");
    }

    @Override
    public void grow() {
        System.out.println("Apple.grow");
    }

    @Override
    public void harvest() {
        System.out.println("Apple.harvest");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
