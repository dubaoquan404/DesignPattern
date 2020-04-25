package cn.zifangsky.designpattern.facade;

/**
 * 子系统业务逻辑A与B组合之后的新的业务逻辑
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Context {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();

    public void complexMethod(){
        this.a.doSomethingA();
        this.b.doSomethingB();
    }
}
