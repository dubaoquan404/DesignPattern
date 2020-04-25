package cn.zifangsky.designpattern.abstractfactory.demo;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class NvWa {

    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();

        //生产线建立完毕，开始生产人了:
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();

        System.out.println("\n---生产一个黄色男性---");
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}
