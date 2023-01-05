package SpringFramework;

import SpringFramework.chapter_1_BeanFactory.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:BeanFacroty
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/9 7:19 PM
 * @Version:1.0
 **/
public class BeanFacroty {
    Map<String,Class> mapClass = new HashMap<>();
    Map<String,Object> mapObject = new HashMap<>();
    public void addClass(String name,Class cls){
        mapClass.put(name,cls);
    }
    public Class getClass(String name){
        return mapClass.get(name);
    }
    public Object getSingletonObject(String name) throws IllegalAccessException, InstantiationException {
        Object object = mapObject.get(name);
        if(object == null){
            System.out.println("Add Object:" + name);
            Class cls = mapClass.get(name);
            object = cls.newInstance();
            mapObject.put(name,object);
        }
        return object;
    }
    public static void main(String[] args) {
        BeanFacroty beanFacroty = new BeanFacroty();
        beanFacroty.addClass("userService",UserService.class);
        try {
            UserService object = (UserService) beanFacroty.getSingletonObject("userService");
            UserService object1 = (UserService) beanFacroty.getSingletonObject("userService");
            object.queryUserInfo();
            object.queryUserInfo();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
