package cn.zifangsky.designpattern.abstractfactory;

import cn.zifangsky.designpattern.factory.AbstractProduct;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义两个工厂
        AbstractFactory factory1 = new Factory1();
        AbstractFactory factory2 = new Factory2();

        //产生A1对象
        AbstractProductA a1 =  factory1.createProductA();
        //产生A2对象
        AbstractProductA a2 = factory2.createProductA();

        //产生B1对象
        AbstractProductB b1 = factory1.createProductB();
        //产生B2对象
        AbstractProductB b2 = factory2.createProductB();

        a1.commonMethod();
        a1.specificMethod();
        a2.specificMethod();
        b1.specificMethod();
        b2.specificMethod();
    }
}
