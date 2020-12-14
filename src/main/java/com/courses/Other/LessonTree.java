package com.courses.Other;

import java.sql.SQLOutput;

public class LessonTree {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        //b = b / a;
        // b /= a;

        int c = 8;
        int d = --c;

        int i = 8;
        int f = i--;

        int x = 10 / 5 * 2;
        String text = "Hello";
        String text2 = "Hello";

        String text3 = new String("hello");
        String text4 = new String("hello");


        boolean bool = a != b;
        boolean bool2 = a >= c;

        boolean bool7 = (5 > 6) || (4 < 6);
        boolean bool8 = (5 < 6) && (4 < 6);

        if (a == b) {
            System.out.println("Hello World");
        } else {
            System.out.println("I like world");
        }

        if (a == 9) {
            System.out.println("Hello World");
        } else if (a != 10) {
            System.out.println("1 else");
        } else if (a > 0) {
            System.out.println("I like world1");
        } else if (a < 1910) {
            System.out.println("I like world2");
        }


        switch (a) {
            case 9:
                System.out.println("first case");
                break;

            case 20:

                System.out.println("second case");
                break;
            case 15:

                System.out.println("third case");
                break;

            default:
                System.out.println("Default");

        }
        int z = a > b ? 10 : 5;

        if (a > b) {
            z = 10;

        } else {
            z = 5;

        }


    }
}
