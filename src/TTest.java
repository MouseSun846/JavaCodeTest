import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static myprint.Print.println;

public class TTest {
    public static void main(String[] args) throws NoSuchMethodException {
        tupleTest();
    }
    //元组测试
    public static void tupleTest(){

        Tuple<String,Integer> tuple = new Tuple<>("tuple",520);
        println(tuple);
    }

    //反射测试
    public static void fansheTest(){
        Initable initable = new Initable();
        println(initable.getClass().getName());
        //通过反射方法访问私有方法
        Method g = null;
        try {
            g = initable.getClass().getDeclaredMethod("g");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        g.setAccessible(true);
        try {
            g.invoke(initable);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
