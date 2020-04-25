package cn.zifangsky.designpattern.abstractfactory;

/**
 * 产品A2的实现类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class ProductA2 extends AbstractProductA{

    @Override
    public void specificMethod() {
        System.out.println("产品A2的独有方法");
    }
}
