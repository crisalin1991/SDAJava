package Fundamentals;

import static Fundamentals.TasksExercices.testObjects;

public class Main {
    public static void main(String[] args) {
        TasksExercices tasksExercices1 = new TasksExercices();
        TasksExercices tasksExercices2 = new TasksExercices();
        TasksExercices.perimeters();
        System.out.println("x=" + tasksExercices1.x);
        System.out.println("y=" + TasksExercices.y);
        System.out.println(tasksExercices1);
        tasksExercices1.x = 22;
        TasksExercices.y = 3;
        System.out.println("x1=" + tasksExercices1.x);
        System.out.println("x2=" + tasksExercices2.x);
        System.out.println("y1=" + TasksExercices.y);
        System.out.println("y2=" + TasksExercices.y);

        //Task1
        TasksExercices.perimeters();
        TasksExercices.printAllPrimeNumbers();
        TasksExercices.longestWord();
        TasksExercices.testString();
        testObjects();
    }
}
