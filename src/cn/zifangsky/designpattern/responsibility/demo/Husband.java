package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 丈夫类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Husband extends AbstractHandler{

    /**
     * 丈夫只处理妻子的请求
     */
    public Husband() {
        super(AbstractHandler.HUSBAND_LEVEL_REQUEST);
    }

    /**
     * 丈夫的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
