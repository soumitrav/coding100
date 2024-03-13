package day5;

import java.lang.reflect.Method;

class TestCustomAnnotation1{
    public static void main(String args[])throws Exception{

        Hello h=new Hello();
        Method[] m=h.getClass().getMethods();

        MyAnnotation manno=m[0].getAnnotation(MyAnnotation.class);
        System.out.println("value is: "+manno.value1());
        System.out.println("value is: "+manno.value2());
        System.out.println("value is: "+manno.value3());
    }}

class Hello {
    @MyAnnotation(value1=10)
    public void sayHello(){System.out.println("hello annotation");

    }
}