package cn.zifangsky.designpattern.bridge;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor implementor = new ConcreteImplementor1();
        //定义一个抽象话角色
        Abstraction abstraction = new RefinedAbstraction(implementor);
        //执行业务
        abstraction.request();
    }
}
