package cn.zifangsky.designpattern.bridge.demo;

/**
 * 山寨公司
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class ShanZhaiCorp extends AbstractCorp{

    public ShanZhaiCorp(IProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司狂赚钱...");
    }
}
