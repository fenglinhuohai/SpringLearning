package SpringFramework.java代理技术;

/**
 * @ClassName:Apple
 * @Description:TODO
 * @Author:joyking
 * @Date:2022/6/15 7:50 PM
 * @Version:1.0
 **/
public class Apple implements PhoneFactory {

    PhoneUser phoneUser;
    public Apple(PhoneUser phoneUser){
        this.phoneUser = phoneUser;
    }
    @Override
    public void getPhone() {
        System.out.println("Apple供应商生产了手机！");
        phoneUser.getPhone();
    }
}
