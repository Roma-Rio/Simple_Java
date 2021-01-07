package ru.epam.fundamentals;
import java.util.Arrays;
import java.util.Scanner;


public class SumOfArgs {
    public static void main(String[] args) {
        int sum=0;
        int len=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all args using space:");
        String ent_args = sc.nextLine();
        System.out.println("String array: "+ent_args);
        len = ent_args.length();
        String [] elems = new String[len];
        int [] arr = new int[len];
        arr[0] = sc.nextInt();
        System.out.println("Array lenth: "+len);
        System.out.println("arr[0]: "+arr[0]);
            for (int i = 0; i < len ; i++) {
                //arr[i] = Integer.arr[i]);
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("sum:"+sum);
            sc.close();
        }
    }


