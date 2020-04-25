package cn.zifangsky.designpattern.factory;

/**
 * 具体产品类2
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class ConcreteProduct2 extends AbstractProduct {

    @Override
    public void specificMethod() {
        System.out.println("模拟具体产品类2的独有方法");
    }
}
