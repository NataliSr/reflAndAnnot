package com.gmail.natalia;

public class Test {

    @MyAnnotation(a = 2, b = 5)
    public void test(int a, int b) {
        System.out.println("a" + " = " + a + "; " + "b" + " = " + b);
    }
}
