package cn.zifangsky.designpattern.proxy.scene2;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        //获取指定的游戏代练
        IGamePlayer proxy = player.getProxy();
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2018-06-06 00:00");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2018-06-08 00:00");
    }
}
