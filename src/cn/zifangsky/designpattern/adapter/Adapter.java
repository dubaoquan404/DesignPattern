package cn.zifangsky.designpattern.adapter;

/**
 * 适配器角色
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Adapter implements ITarget{
    /**
     * 需要适配的源角色
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //构建需要的新的业务逻辑
        adaptee.specificRequest();
        System.out.println("适配成功");
    }
}
