package ru.epam.fundamentals;

import java.util.Scanner;

public class MonthViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month's number:");
            if (sc.hasNextInt()) {
                while (true) {
                int month = sc.nextInt();
                if (month < 13 && month > 0) {
                    switch (month) {
                        case 1:
                            System.out.println("Current month is January");
                            break;
                        case 2:
                            System.out.println("Current month is February");
                            break;
                        case 3:
                            System.out.println("Current month is March");
                            break;
                        case 4:
                            System.out.println("Current month is April");
                            break;
                        case 5:
                            System.out.println("Current month is May");
                            break;
                        case 6:
                            System.out.println("Current month is June");
                            break;
                        case 7:
                            System.out.println("Current month is July");
                            break;
                        case 8:
                            System.out.println("Current month is August");
                            break;
                        case 9:
                            System.out.println("Current month is September");
                            break;
                        case 10:
                            System.out.println("Current month is October");
                            break;
                        case 11:
                            System.out.println("Current month is November");
                            break;
                        case 12:
                            System.out.println("Current month is December");
                            break;
                        default:
                            System.out.println("Enter correct month number");
                            break;
                    }
                } else {
                    System.out.println("Enter month number from 1 to 12");
                    continue;
                }break;
//            System.out.println("Expecting input a number from 1 to 12");
//            break;

            }//sc.close();
        }

    }
}







