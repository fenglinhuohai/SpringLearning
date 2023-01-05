package SpringFramework.chapter_1_BeanFactory;

import SpringFramework.chapter_1_BeanFactory.AbstractAutowireCapableBeanFactory;
import SpringFramework.chapter_1_BeanFactory.BeanDefinition;
import SpringFramework.chapter_1_BeanFactory.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:DefaultListableBeanFactory
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/9 4:08 PM
 * @Version:1.0
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws Exception {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if(beanDefinition == null)
            throw new Exception(beanName + "is defined!");
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
