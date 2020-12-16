package com.courses.Other;

public class StringBuilderTypes {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Warm");

        sb.append(" Greetings");
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.delete(3, 6);
        System.out.println(sb);

        sb.insert(5, "\u263A" + "Hope it looks right" + "\u263A");
        System.out.println(sb);

        sb.replace(1, 30, "ing");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.substring(3));

        // Or
        // String a = sb.substring(3);
        //System.out.println(a);//

        System.out.println(sb.substring(1, 3));



    }
}

