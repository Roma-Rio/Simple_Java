package ru.epam.fundamentals;

public class ArraySum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int sum = 0;
        int proiz = 1;
        for ( int i=0;i<arr.length;i++ ) {
            sum=sum+arr[i];
            proiz = proiz*arr[i];
        }
        System.out.println(sum);
        System.out.println(proiz);
    }
}
