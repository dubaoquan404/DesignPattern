package cn.zifangsky.designpattern.flyweight;

/**
 * 具体享元角色2
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class ConcreteFlyweight2 extends Flyweight {

    protected ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
        super.setIntrinsic("内部状态2");
    }

    /**
     * 根据外部状态定义业务逻辑
     */
    @Override
    public void operate() {
        System.out.println(super.toString());
    }
}
