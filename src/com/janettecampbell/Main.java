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

        Date now = new Date();

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
