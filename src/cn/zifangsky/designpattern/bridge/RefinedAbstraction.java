package cn.zifangsky.designpattern.bridge;

/**
 * 具体抽象化角色
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 修正父类的行为
     */
    @Override
    public void request() {
        //业务处理，省略...
        super.request();
        super.getImplementor().doSomething();
    }
}
