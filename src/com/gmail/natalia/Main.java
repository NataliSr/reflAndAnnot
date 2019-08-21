package com.gmail.natalia;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Class<?> cl = test.getClass();

        try {
            Method[] methods = cl.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation an = method.getAnnotation(MyAnnotation.class);
                    method.invoke(test, an.a(), an.b());
                }
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
