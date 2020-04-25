package cn.zifangsky.designpattern.template;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate class1 = new ConcreteClass1();
        AbstractTemplate class2 = new ConcreteClass2();

        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
