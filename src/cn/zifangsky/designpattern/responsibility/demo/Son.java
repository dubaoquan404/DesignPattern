package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 儿子类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Son extends AbstractHandler{

    /**
     * 儿子只处理母亲的请求
     */
    public Son() {
        super(AbstractHandler.SON_LEVEL_REQUEST);
    }

    /**
     * 儿子的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
