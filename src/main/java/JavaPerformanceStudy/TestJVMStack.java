package JavaPerformanceStudy;

/**
 * @ClassName:TestJVMStack
 * @Description:TODO
 * @Author:joyking
 * @Date:2023/1/3 9:09 PM
 * @Version:1.0
 **/
public class TestJVMStack {
    private int count = 0;
    public void recursion(){
        count++;
        System.out.println(count);
        recursion();
    }

    public static void main(String[] args) {
        TestJVMStack testJVMStack = new TestJVMStack();
        try{
            testJVMStack.recursion();
        }catch (Throwable e){
            System.out.println("deep of stack is " + testJVMStack.count);
            e.printStackTrace();
        }

    }
}
