package cn.zifangsky.designpattern.flyweight.demo;

/**
 * 测试
 *
 * @author zifangsky
 * @date 2018/5/16
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //初始化对象池
        for(int i=0;i<3;i++){
            String subject = "科目" + i;

            for(int j=0;j<10;j++){
                String key = subject + "#考试地点"+j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1#考试地点1");
        System.out.println(signInfo);
    }
}
