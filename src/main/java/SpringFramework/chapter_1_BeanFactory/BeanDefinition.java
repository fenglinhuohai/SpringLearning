package SpringFramework.chapter_1_BeanFactory;

/**
 * @ClassName:BeanDefinition
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/2 6:43 PM
 * @Version:1.0
 **/
public class BeanDefinition {

    private Class bean;

    public Class getBean() {
        return bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }

    public BeanDefinition(Class bean){
        this.bean = bean;
    }

}
