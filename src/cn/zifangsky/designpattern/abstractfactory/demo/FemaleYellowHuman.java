package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 黄色女性人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class FemaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("女性黄种人");
    }
}
