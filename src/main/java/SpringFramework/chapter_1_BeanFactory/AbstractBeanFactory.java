package SpringFramework.chapter_1_BeanFactory;

/**
 * @ClassName:AbstractBeanFactory
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/9 11:44 AM
 * @Version:1.0
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    public Object getBean(String name) throws Exception {
        Object bean = getSingleton(name);
        if(bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws Exception;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);
}
