package main;

import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
    public static double cubed(int num) {
        return Math.pow(num, 3);
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double median(int[] intArr) {
        Arrays.sort(intArr);
        double median;
        if (intArr.length % 2 == 0) {
            median = ((double) intArr[intArr.length / 2] + (double) intArr[intArr.length / 2 - 1]) / 2;
        } else {
            median = (double) intArr[intArr.length / 2];
        }
        return median;
    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> arrList) {
        for (Cat cat : arrList) {
            if (!cat.getColor().equals(cat.getColor().toUpperCase())) {
                String newColor = cat.getColor().toUpperCase();
                cat.setColor(newColor);
            }
        }
        return arrList;
    }
}
