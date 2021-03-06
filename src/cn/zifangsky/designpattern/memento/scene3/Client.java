package cn.zifangsky.designpattern.memento.scene3;

/**
 * 场景类
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义发起人
        Originator originator = new Originator();

        originator.setState("「初始状态」");
        System.out.println("初始状态是： " + originator.getState());

        //建立备份
        originator.createMemento();

        //修改状态
        originator.setState("「被修改状态」");
        System.out.println("修改后状态是： " + originator.getState());

        //恢复备份
        originator.restoreMemento();
        System.out.println("恢复后状态是： " + originator.getState());
    }
}
