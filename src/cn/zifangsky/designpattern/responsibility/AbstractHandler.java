package cn.zifangsky.designpattern.responsibility;

/**
 * 抽象处理者
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public abstract class AbstractHandler {
    /**
     * 下一个处理者
     */
    private AbstractHandler nextHandler;

    /**
     * 每个处理者都必须对请求做出处理
     */
    public final void handlerMessage(Request request){
        //判断是否是自己的处理级别
        if(this.getHandlerLevel().getLevel() == request.getRequestLevel()){
            this.response(request);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.handlerMessage(request);
            }else{
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    /**
     * 设置下一个处理者是谁
     */
    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 获取处理级别
     */
    protected abstract Level getHandlerLevel();

    /**
     * 处理请求
     */
    protected abstract void response(Request request);
}
