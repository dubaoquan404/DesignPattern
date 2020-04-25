package cn.zifangsky.designpattern.bridge.demo;

/**
 * 房地产公司
 *
 * @author zifangsky
 * @date 2018/6/17
 * @since 1.0.0
 */
public class HouseCorp extends AbstractCorp{

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
