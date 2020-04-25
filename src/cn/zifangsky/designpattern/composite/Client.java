package cn.zifangsky.designpattern.composite;

/**
 * 测试类
 *
 * @author zifangsky
 * @date 2018/5/31
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    //通过递归遍历树
    public static void display(Component root){
        for(Component c : root.getChildren()){
            //叶子节点
            if(c instanceof Leaf){
                c.doSomething();
            }else{ //树枝节点
                display(c);
            }
        }
    }
}
