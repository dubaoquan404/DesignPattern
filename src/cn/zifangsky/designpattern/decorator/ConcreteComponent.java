package cn.zifangsky.designpattern.decorator;

/**
 * 具体构件
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class ConcreteComponent implements IComponent {

    @Override
    public void baseMethod() {
        System.out.println("执行基本方法");
    }
}
