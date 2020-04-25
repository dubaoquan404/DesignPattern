package cn.zifangsky.designpattern.proxy.dynamicProxy;

/**
 * 具体的通知实现
 *
 * @author zifangsky
 * @date 2018/6/11
 * @since 1.0.0
 */
public class BeforeAdvice implements IAdvice{

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
