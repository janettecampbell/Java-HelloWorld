package com.janettecampbell;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
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
        

        Date now = new Date();

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
