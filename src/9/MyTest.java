package zhmaylo;

import java.lang.reflect.Method;

public class MyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        start();
    }

    public static void start() throws NoSuchMethodException {
        Method[] methods = WrappedClass.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ThisIsTest.class)){
                System.out.println(method);
            }

        }
    }
}
