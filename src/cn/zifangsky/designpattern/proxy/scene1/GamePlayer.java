package cn.zifangsky.designpattern.proxy.scene1;

/**
 * 普通代理的游戏者
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class GamePlayer implements IGamePlayer{
    private String name = "";

    /**
     * 构造函数限制谁能创建对象，并同时传递姓名
     */
    public GamePlayer(IGamePlayer gamePlayer,String name) throws Exception {
        if(gamePlayer == null){
            throw new Exception("不能创建真实角色！");
        }

        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为「"+user + "」的用户「" + this.name + "］登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println("「" + this.name + "］在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println("「" + this.name + "］又升了一级！");
    }
}
