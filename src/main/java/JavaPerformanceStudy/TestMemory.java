package JavaPerformanceStudy;


import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName:TestMemory
 * @Description:TODO
 * @Author:joyking
 * @Date:2023/1/3 10:24 PM
 * @Version:1.0
 **/
public class TestMemory {

    private static class T{

    }

    public static void main(String[] args) throws InterruptedException{
        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }
}
