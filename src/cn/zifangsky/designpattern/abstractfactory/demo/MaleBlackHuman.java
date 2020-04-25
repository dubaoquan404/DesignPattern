package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 黑色男性人种
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class MaleBlackHuman extends AbstractBlackHuman{

    @Override
    public void getSex() {
        System.out.println("男性黑人");
    }
}
