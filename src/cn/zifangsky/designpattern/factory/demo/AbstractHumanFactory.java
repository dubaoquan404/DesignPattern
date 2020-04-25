package cn.zifangsky.designpattern.factory.demo;

/**
 * 抽象的人类创建工厂
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public abstract class AbstractHumanFactory {
    /**
     * 创造不同肤色的人类
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
