package SpringFramework.chapter_1_BeanFactory;

/**
 * @ClassName:AbstractAutowireCapableBeanFactory
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/9 11:54 AM
 * @Version:1.0
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    protected Object createBean(String beanName, BeanDefinition beanDefinition){
        Object bean = null;
        try {
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
