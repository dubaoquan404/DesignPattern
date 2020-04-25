package cn.zifangsky.designpattern.abstractfactory;

/**
 * 创建产品等级1的工厂实现类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class Factory1 extends AbstractFactory{

    /**
     * 只生产产品等级为1的A产品
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品等级为1的B产品
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
