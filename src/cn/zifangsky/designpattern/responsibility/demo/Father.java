package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 父亲类
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class Father extends AbstractHandler{

    /**
     * 父亲只处理女儿的请求
     */
    public Father() {
        super(AbstractHandler.FATHER_LEVEL_REQUEST);
    }

    /**
     * 父亲的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
