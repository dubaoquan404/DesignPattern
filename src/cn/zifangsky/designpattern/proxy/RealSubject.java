package cn.zifangsky.designpattern.proxy;

/**
 * 真实主题类
 *
 * @author zifangsky
 * @date 2018/6/5
 * @since 1.0.0
 */
public class RealSubject implements ISubject{

    @Override
    public void request() {
        //具体的业务逻辑
        System.out.println("模拟具体的业务逻辑");
    }
}
