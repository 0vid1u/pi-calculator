package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final Random rnd = new Random();

    public static void main(String[] args) {
        double countAll, countInCircle = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of points: ");
        countAll = scanner.nextDouble();

        for (double i = 0; i < countAll; i++) {
            double x = randomFrom0To1();
            double y = randomFrom0To1();

            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                countInCircle++;
            }
        }

        double pi = 4 * countInCircle / countAll;

        System.out.println("\uD835\uDF0B = " + pi);
    }

    public static double randomFrom0To1() {
        return rnd.nextDouble();
    }
}
