package cn.zifangsky.designpattern.facade;

/**
 * 提供给外部系统访问的门面
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private Context context = new Context();

    /**
     * 提供给外部访问的方法
     */
    public void methodA(){
        this.a.doSomethingA();
    }

    public void methodB(){
        this.b.doSomethingB();
    }

    public void methodC(){
        this.context.complexMethod();
    }

}
