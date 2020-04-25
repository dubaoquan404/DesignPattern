package cn.zifangsky.designpattern.proxy.scene2;

/**
 * 游戏者接口
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public interface IGamePlayer {
    /**
     * 登录游戏
     */
    public void login(String user, String password);

    /**
     * 杀怪
     */
    public void killBoss();

    /**
     * 升级
     */
    public void upgrade();

    /**
     * 每个人都可以找一下自己的代理
     */
    public IGamePlayer getProxy();
}
