package SpringFramework.java代理技术;

/**
 * @ClassName:PhoneUser
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/15 7:48 PM
 * @Version:1.0
 **/
public class PhoneUser implements PhoneFactory {
    @Override
    public void getPhone() {
        System.out.println("用户购买了手机!");
    }
}
