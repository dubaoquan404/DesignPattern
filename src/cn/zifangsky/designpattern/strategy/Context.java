package cn.zifangsky.designpattern.strategy;

/**
 * 封装策略角色
 *
 * @author zifangsky
 * @date 2018/5/29
 * @since 1.0.0
 */
public class Context {
    /**
     * 抽象策略
     */
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doSomething(){
        this.strategy.strategyMethod();
    }
}
