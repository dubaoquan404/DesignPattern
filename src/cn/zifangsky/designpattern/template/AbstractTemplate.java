package cn.zifangsky.designpattern.template;

/**
 * 抽象模板类
 *
 * @author zifangsky
 * @date 2018/5/18
 * @since 1.0.0
 */
public abstract class AbstractTemplate {

    /**
     * 基本方法1
     */
    protected abstract void doSomething();

    /**
     * 基本方法2
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     * <p>为了防止恶意修改，一般模板方法都要加上final关键字，不允许被覆写。<p/>
     */
    public final void templateMethod(){
        //调用基本方法，完成相关逻辑
        this.doAnything();
        this.doSomething();
    }
}
