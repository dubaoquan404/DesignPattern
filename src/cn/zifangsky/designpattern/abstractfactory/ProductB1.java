package cn.zifangsky.designpattern.abstractfactory;

/**
 * 产品B1的实现类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class ProductB1 extends AbstractProductB{

    @Override
    public void specificMethod() {
        System.out.println("产品B1的独有方法");
    }
}
