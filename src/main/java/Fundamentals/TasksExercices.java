package Fundamentals;

import java.util.Scanner;

public class TasksExercices {
    public static float pi = (float) Math.PI;

    int x = 10;
    static int y=1;

    public static void perimeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter:");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter has the flowing lenght:" + diameter * pi);

    }
}
