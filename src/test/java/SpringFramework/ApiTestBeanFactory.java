package SpringFramework;

import SpringFramework.chapter_1_BeanFactory.BeanDefinition;
import SpringFramework.chapter_1_BeanFactory.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @ClassName:ApiTestBeanFactory
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/2 6:57 PM
 * @Version:1.0
 **/
public class ApiTestBeanFactory {
    @Test
    public void test_BeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        UserService userService_singleton = (UserService)beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
