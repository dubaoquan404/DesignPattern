package cn.zifangsky.designpattern.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractFactory {
    /**
     * 创建A产品家族
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     */
    public abstract AbstractProductB createProductB();
}
