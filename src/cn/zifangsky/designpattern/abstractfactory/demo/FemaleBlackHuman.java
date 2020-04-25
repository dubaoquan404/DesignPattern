package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 黑色女性人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class FemaleBlackHuman extends AbstractBlackHuman{

    @Override
    public void getSex() {
        System.out.println("女性黑人");
    }
}
