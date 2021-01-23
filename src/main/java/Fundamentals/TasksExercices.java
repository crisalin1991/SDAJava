package Fundamentals;

import java.util.Scanner;

public class TasksExercices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter:");
        float diameter = scanner.nextFloat();
        float pi = (float) Math.PI;
        System.out.println("the perimeter has the flowing lenght:" + diameter*pi);
    }
}
