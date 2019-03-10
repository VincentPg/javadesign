package cn.com.study.simpleFactory.product.impl;

import cn.com.study.simpleFactory.product.Fruit;

/**
 * 葡萄
 */
public class Grape  implements Fruit {
    /**葡萄有无籽划分**/
    private boolean seedless;

    @Override
    public void plant() {
        System.out.println("Grape.plant");
    }

    @Override
    public void grow() {
        System.out.println("Grape.grow");
    }

    @Override
    public void harvest() {
        System.out.println("Grape.harvest");
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }


}
