package cn.zifangsky.designpattern.prototype;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //产生一个对象
        PrototypeClass1 class1 = new PrototypeClass1();
        //添加一个值
        class1.addValue("张三");

        //拷贝一个对象
        PrototypeClass1 cloneClass1 = class1.clone();
        //给拷贝对象添加一个值
        cloneClass1.addValue("李四");
        //输出
        System.out.println(cloneClass1.getValue());

        //产生一个对象
        PrototypeClass2 class2 = new PrototypeClass2();
        //添加一个值
        class2.addValue("张三");

        //拷贝一个对象
        PrototypeClass2 cloneClass2 = class2.clone();
        //给拷贝对象添加一个值
        cloneClass2.addValue("李四");
        //输出
        System.out.println(cloneClass2.getValue());
    }
}
