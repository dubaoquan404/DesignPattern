package cn.zifangsky.designpattern.bridge.demo;

/**
 * 抽象公司类
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public abstract class AbstractCorp {
    /**
     * 定义一个抽象的产品对象
     */
    private IProduct product;

    public AbstractCorp(IProduct product) {
        this.product = product;
    }

    /**
     * 公司是干什么的？赚钱的！
     */
    public void makeMoney(){
        //先生产
        this.product.beProducted();
        //后销售
        this.product.beSelled();
    }
}
