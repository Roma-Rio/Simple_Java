package ru.epam.fundamentals;

public class Test {

    public static void main(String[] args) {
        long a = 2147483647000L;
        System.out.println((int)a);
        int b = 1;
        System.out.println(b);
        b += a;
        Object ab = (Object) b;
        System.out.println(b);
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }
}
