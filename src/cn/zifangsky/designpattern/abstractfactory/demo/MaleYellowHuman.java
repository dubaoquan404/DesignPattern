package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 黄色男性人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class MaleYellowHuman extends AbstractYellowHuman{

    @Override
    public void getSex() {
        System.out.println("男性黄种人");
    }
}
