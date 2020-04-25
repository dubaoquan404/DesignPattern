package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 抽象的人类创建工厂
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public interface HumanFactory {

    /**
     * 制造一个黄色人种
     */
    public Human createYellowHuman();

    /**
     * 制造一个白色人种
     */
    public Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     */
    public Human createBlackHuman();
}
