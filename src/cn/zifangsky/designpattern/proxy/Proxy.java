package cn.zifangsky.designpattern.proxy;

/**
 * 代理类
 *
 * @author zifangsky
 * @date 2018/6/5
 * @since 1.0.0
 */
public class Proxy implements ISubject{
    /**
     * 要代理哪个实现类
     */
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    /**
     * 预处理
     */
    private void before(){
        System.out.println("模拟预处理");
    }

    /**
     * 善后处理
     */
    private void after(){
        System.out.println("模拟善后处理");
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
}
