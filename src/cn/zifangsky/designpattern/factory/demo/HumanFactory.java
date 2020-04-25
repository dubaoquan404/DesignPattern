package cn.zifangsky.designpattern.factory.demo;

/**
 * 真正的人类创建工厂
 *
 * @author zifangsky
 * @date 2018/5/17
 * @since 1.0.0
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T result = null;

        try {
            //产生一个人种
            result = (T) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("人类创建过程发生异常");
        }

        return result;
    }
}
