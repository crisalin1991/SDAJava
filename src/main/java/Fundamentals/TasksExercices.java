package Fundamentals;

import java.util.Scanner;

public class TasksExercices {
    public static float pi = (float) Math.PI;

    int x = 10;
    static int y = 1;

    public static void perimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter:");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the flowing lenght:" + diameter * pi);

    }

    public static void printAllPrimeNumbers() {
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println("The number is not greater then 1");
            return;
        } else {
            for (int i = 2; i < newNumber; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
        System.out.println("a");
    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
            }
        }
        return isPrimeNo;
    }

    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                continue;
            }
            isPrimeNo = false;
            break;
        }
        return isPrimeNo;
    }
}