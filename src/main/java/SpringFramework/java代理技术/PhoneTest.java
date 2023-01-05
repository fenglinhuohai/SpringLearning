package SpringFramework.java代理技术;

/**
 * @ClassName:PhoneTest
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/15 7:49 PM
 * @Version:1.0
 **/


public class PhoneTest {
    public static void main(String[] args) {
        Apple apple = new Apple(new PhoneUser());
        apple.getPhone();
    }
}
