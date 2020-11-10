package com.epam.homework1.scanner;

import java.util.Scanner;

public class DataReader {

    public static int[] enterFourIntFromConsole() {
        Scanner scanner;
        int result[] = new int[4];
        int i = 0;

        while (true) {
            scanner = new Scanner(System.in);


            if (scanner.hasNextInt()) {
                result[i] = scanner.nextInt();
                i++;
                if (i == 4)
                    break;

            } else System.out.println("Введен неверный тип данных, повторите попытку");

        }


        return result;
    }

    public static double enterDoubleFromConsole() {
        Scanner scanner;
        double result;

        while (true) {
            scanner = new Scanner(System.in);

            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                break;
            } else {
                System.out.println("Введен неверный тип данных, повторите попытку");
                scanner.reset();
            }
        }
        return result;
    }

    public static int enterIntFromConsole() {
        Scanner scanner;
        int result;

        while (true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                break;
            } else {
                System.out.println("Введен неверный тип данных, повторите попытку");
            }
        }
        return result;
    }

    public static int[] enterTwoIntFromConsole() {

        Scanner scanner;
        int result[] = new int[2];
        int i = 0;

        while (true) {
            scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                result[i] = scanner.nextInt();
                i++;
                if (i == 2)
                    break;
            } else System.out.println("Введен неверный тип данных, повторите попытку");
        }
        return result;
    }

    public static double[] enterThreeDoubleFromConsole() {
        Scanner scanner;

        double result[] = new double[3];
        int i = 0;

        while (true) {

            scanner = new Scanner(System.in);

            if (scanner.hasNextDouble()) {
                result[i] = scanner.nextDouble();
                i++;
                if (i == 3)
                    break;
            } else System.out.println("Введен неверный тип данных, повторите попытку");
        }
        return result;
    }

}
