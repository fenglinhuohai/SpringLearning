package SpringFramework.chapter_1_BeanFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName:BeanFactory
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/2 6:46 PM
 * @Version:1.0
 **/
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
