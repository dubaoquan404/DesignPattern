package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 人类总称
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public interface Human {

    /**
     * 每个人种的皮肤都有相应的颜色
     */
    public void getColor();

    /**
     * 每个人种都有独特的说话方式
     */
    public void talk();

    /**
     * 每个人都有性别
     */
    public void getSex();
}
