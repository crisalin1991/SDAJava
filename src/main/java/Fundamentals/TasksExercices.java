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

    public static void longestWord() {
        System.out.println("Type your word");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord1 = "";
        while (!word.equals("Enough")) {
            word = scanner.next();
            if (longestWord1.length() < word.length() && !word.equals("Enough")) {
                longestWord1 = word;
            }
        }
        if (longestWord1.length() == 0) {
            System.out.println("No text provide");
            return;
        }
        System.out.println("longest word is: " + longestWord1);
    }


    public static void testString() {
        System.out.println(true);
        System.out.println(true);
        System.out.println(true);
    }

    public static void testObjects() {
        dog dog1 = new dog("Azorel");
        dog1.setName("Azorel");

        dog dog2 = new dog("Azorel");
        dog1.setName("Azorel");

        System.out.println((dog1.equals(dog2)));
        System.out.println(dog1.equals(dog2));


    }
}