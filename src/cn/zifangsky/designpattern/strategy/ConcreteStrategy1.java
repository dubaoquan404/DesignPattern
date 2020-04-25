package cn.zifangsky.designpattern.strategy;

/**
 * 具体策略角色1
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class ConcreteStrategy1 implements Strategy{

    @Override
    public void strategyMethod() {
        System.out.println("执行具体的策略方法1");
    }
}
