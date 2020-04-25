package cn.zifangsky.designpattern.abstractfactory;

/**
 * 产品A1的实现类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class ProductA1 extends AbstractProductA{

    @Override
    public void specificMethod() {
        System.out.println("产品A1的独有方法");
    }
}
