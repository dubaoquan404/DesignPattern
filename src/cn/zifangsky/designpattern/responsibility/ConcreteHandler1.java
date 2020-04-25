package cn.zifangsky.designpattern.responsibility;

/**
 * 具体处理者1
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public class ConcreteHandler1 extends AbstractHandler{

    @Override
    protected Level getHandlerLevel() {
        return Level.LEVEL1;
    }

    @Override
    protected void response(Request request) {
        System.out.println("ConcreteHandler1对请求「" + request.getRequestMessage() + "］处理完成");
    }
}
