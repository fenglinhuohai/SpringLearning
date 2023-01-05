package SpringFramework.chapter_1_BeanFactory;

import SpringFramework.chapter_1_BeanFactory.BeanDefinition;

/**
 * @ClassName:BeanDefinitionRegistry
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/9 4:10 PM
 * @Version:1.0
 **/
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName,BeanDefinition beanDefinition);
}
