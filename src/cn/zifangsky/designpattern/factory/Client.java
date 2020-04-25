package cn.zifangsky.designpattern.factory;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();

        //创建产品1
        AbstractProduct product = factory.createProduct(ConcreteProduct1.class);

        product.commonMethod();
        product.specificMethod();
    }
}
