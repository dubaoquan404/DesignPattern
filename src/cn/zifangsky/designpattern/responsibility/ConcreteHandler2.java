package cn.zifangsky.designpattern.responsibility;

/**
 * 具体处理者2
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class ConcreteHandler2 extends AbstractHandler{

    @Override
    protected Level getHandlerLevel() {
        return Level.LEVEL2;
    }

    @Override
    protected void response(Request request) {
        System.out.println("ConcreteHandler2对请求「" + request.getRequestMessage() + "］处理完成");
    }
}
