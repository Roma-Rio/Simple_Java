package ru.epam.fundamentals;

import java.util.Scanner;

public class InputArgs {
    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter args:");
        sbuf.append(input.nextLine());
        String revarg = sbuf.reverse().toString();
        System.out.println("Reversed args: "+revarg);
    }
}
