package SpringFramework.chapter_1_BeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:DefaultSingletonBeanRegistry
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/8 8:55 PM
 * @Version:1.0
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String,Object> singletonObjects = new HashMap<>();
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }
    protected void addSingleton(String beanName,Object bean){
        singletonObjects.put(beanName,bean);
    }
}
