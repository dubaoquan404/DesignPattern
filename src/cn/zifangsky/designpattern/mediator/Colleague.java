package cn.zifangsky.designpattern.mediator;

/**
 * 抽象同事类
 *
 * @author zifangsky
 * @date 2018/5/28
 * @since 1.0.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
