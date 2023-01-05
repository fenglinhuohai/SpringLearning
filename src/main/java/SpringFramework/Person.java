package SpringFramework;

import java.lang.reflect.Constructor;

/**
 * @ClassName:Person
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/14 6:55 PM
 * @Version:1.0
 **/
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        Constructor[] ctr = Person.class.getDeclaredConstructors();
    }
}
