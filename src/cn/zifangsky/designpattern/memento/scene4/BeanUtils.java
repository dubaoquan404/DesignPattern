package cn.zifangsky.designpattern.memento.scene4;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * BeanUtils工具类
 *
 * @author zifangsky
 * @date 2018/5/4
 * @since 1.0.0
 */
public class BeanUtils {

    /**
     * 获取一个Bean的所有属性，并存入Map
     * @author zifangsky
     * @date 2018/5/4 16:32
     * @since 1.0.0
     * @param bean Bean
     * @return java.util.Map<java.lang.String,java.lang.Object>
     */
    public static Map<String,Object> backupProp(Object bean){
        Map<String,Object> result = new HashMap<String, Object>();

        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            //遍历所有属性
            for(PropertyDescriptor descriptor : descriptors){
                //属性名称
                String fieldName = descriptor.getName();
                //读取属性的getter方法
                Method getter = descriptor.getReadMethod();

                if(!"class".equals(fieldName)){
                    //读取属性值
                    Object fieldValue = getter.invoke(bean);

                    result.put(fieldName,fieldValue);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

    /**
     * 使用Map中的数据给一个Bean的所有属性赋值
     * @author zifangsky
     * @date 2018/5/4 16:33
     * @since 1.0.0
     * @param bean Bean
     * @param propMap 存放<属性名,属性值>的Map
     */
    public static void restoreProp(Object bean,Map<String,Object> propMap){
        try {
            //获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());

            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();

            //遍历所有属性
            for(PropertyDescriptor descriptor : descriptors){
                //属性名称
                String fieldName = descriptor.getName();

                if(propMap.containsKey(fieldName)){
                    //写属性的方法
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(bean,propMap.get(fieldName));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
