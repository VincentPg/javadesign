package cn.com.study.abstractFactory;

import cn.com.study.abstractFactory.factory.GardenerFactory;
import cn.com.study.abstractFactory.factory.impl.TropicalGardenerFactory;

public class Client {
    public static void main(String[] args) {
        //构建热带园丁工厂，即热带产品族工厂
        GardenerFactory gdf = new TropicalGardenerFactory();
        gdf.createFruit("苹果");
        gdf.createVeggie("大白菜");
    }
}
