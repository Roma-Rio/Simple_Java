package ru.epam.fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RandomDigits {
    public static void main(String[] args) {
        String fol = "";
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            Random r = new Random();
            t = r.nextInt();
            String oneline = String.valueOf(t);
            fol = fol.concat(oneline).concat(" ");
            System.out.println("Current line: " + t);
        }System.out.println("One line : " + fol);
        sc.close();
    }
}
