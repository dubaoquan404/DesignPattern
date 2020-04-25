package cn.zifangsky.designpattern.decorator;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        IComponent component = new ConcreteComponent();

        //第一次装饰
        component = new ConcreteDecorator1(component);
        //第二次装饰
        component = new ConcreteDecorator2(component);

        //装饰后运行
        component.baseMethod();
    }
}
