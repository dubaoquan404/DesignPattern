package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 女性人类创建工厂
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class FemaleFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
