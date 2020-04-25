package cn.zifangsky.designpattern.proxy.scene2;

/**
 * 强制代理的真实角色
 *
 * @author zifangsky
 * @date 2018/6/6
 * @since 1.0.0
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    /**
     * 游戏者的代理
     */
    private IGamePlayer proxy;

    /**
     * 构造函数限制谁能创建对象，并同时传递姓名
     */
    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为「"+user + "」的用户「" + this.name + "］登录成功！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println("「" + this.name + "］在打怪！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println("「" + this.name + "］又升了一级！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 校验是否是代理访问
     */
    private boolean isProxy(){
        return this.proxy != null;
    }
}
