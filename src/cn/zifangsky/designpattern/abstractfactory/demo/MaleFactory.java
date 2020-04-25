package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 男性人类创建工厂
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class MaleFactory implements HumanFactory{

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
