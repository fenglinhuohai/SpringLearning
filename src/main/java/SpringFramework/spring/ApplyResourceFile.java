package SpringFramework.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName:ApplyResourceFile
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/22 9:11 PM
 * @Version:1.0
 **/
public class ApplyResourceFile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");
        System.out.println(helloBean.getHelloWorld());
    }
}
