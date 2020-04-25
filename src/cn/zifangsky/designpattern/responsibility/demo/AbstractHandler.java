package cn.zifangsky.designpattern.responsibility.demo;

/**
 * 抽象处理者
 *
 * @author zifangsky
 * @date 2018/6/12
 * @since 1.0.0
 */
public abstract class AbstractHandler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;

    /**
     * 当前Handler能处理的级别
     */
    private int level = 0;

    /**
     * 责任传递，下一个人责任人是谁
     */
    private AbstractHandler nextHandler;

    public AbstractHandler(int level){
        this.level = level;
    }

    /**
     * 一个女性（女儿、妻子或者是母亲）要求逛街，你要处理这个请求
     */
    public final void handlerMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            if(this.nextHandler != null){
                this.nextHandler.handlerMessage(women);
            }else{
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     */
    protected abstract void response(IWomen women);
}
