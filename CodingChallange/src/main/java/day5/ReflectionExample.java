package day5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample {

    public static void main(String []args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> hello = Class.forName("day5.Hello");
        Class<?> test = Class.forName("day5.Test");

        System.out.println(hello.getName());
        System.out.println(test.getName());
        System.out.println(hello.isInterface());
        System.out.println(test.isInterface());

        Constructor<?> constructor = test.getConstructor(new Class[]{Integer.class});
        Test o1 = (Test)constructor.newInstance(10);
        System.out.println(o1.getTestId());

        Test o2 = (Test)test.getConstructor(null).newInstance();
        System.out.println(o2.getTestId());
    }




}
