package cn.zifangsky.designpattern.bridge;

/**
 * 抽象化角色
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public abstract class Abstraction {

    /**
     * 定义对实现化角色的引用
     */
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 自身的行为和属性
     */
    public void request(){
        this.implementor.doSomething();
    }

    /**
     * 获得实现化角色
     */
    public Implementor getImplementor(){
        return implementor;
    }
}
