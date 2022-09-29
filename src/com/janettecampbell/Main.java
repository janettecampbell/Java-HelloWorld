package com.janettecampbell;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        byte x = 1;
        byte y = x;
        x = 2;
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        String message = "  Hello \"World\"" + "!!  ";
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        numbers[0][0] = 1;
        final float PI = 3.14F;
        double result = (double) 10 / (double) 3;
        int x1 = 1;
        x1 += 2;

        // Implicit Casting
        // double > float > long > int > short > byte
        double x2 = 1.1;
        double y2 = x2 + 2;

        // Explicit Casting
        double x3 = 1.1;
        int y3 = (int) x3 + 2;

        // String to number
        String x4 = "1";
        int y4 = Integer.parseInt(x4) + 2;
        String x5 = "1.1";
        double y5 = Double.parseDouble(x5) + 2;

        // Math Class
        int result1 = Math.round(1.1F);
        int result2 = (int) Math.ceil(1.1F);
        int result3 = (int) Math.floor(1.1F);
        int result4 = Math.max(1, 2);
        // Random formula for random Math.floor(Math.random() * (max - min + 1) + min);
        double result5 = Math.random() * 100; // random number from 0 to 100
        int result6 = (int) Math.round(Math.random() * 100);

        // Format Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result7 = currency.format(1234567.891);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result8 = percent.format(0.1);
        String result9 = NumberFormat.getPercentInstance().format(0.1);

        // Read Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age1 = scanner.nextByte();
        System.out.println("You are " + age1);
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);


        System.out.println(result9);
        System.out.println(result8);
        System.out.println(result7);
        System.out.println(result6);
        System.out.println(result5);
        System.out.println(result4);
        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
        System.out.println(y5);
        System.out.println(y4);
        System.out.println(y3);
        System.out.println(y2);
        System.out.println(x1);
        System.out.println(result);
        System.out.println(Arrays.deepToString(numbers));
        System.out.println(message.trim());
        System.out.println(message);
        System.out.println(point2);
        System.out.println(now);
        System.out.println(y);
        System.out.println(age);
        System.out.println(message);
    }
}
