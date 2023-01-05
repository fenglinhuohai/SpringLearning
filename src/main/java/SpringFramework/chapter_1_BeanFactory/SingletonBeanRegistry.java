package SpringFramework.chapter_1_BeanFactory;

/**
 * @ClassName:SingleBeanRegistry
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/8 8:27 PM
 * @Version:1.0
 **/
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}