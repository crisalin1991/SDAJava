package Fundamentals;

public class Main {
    public static void main(String[] args) {
        TasksExercices tasksExercices1 = new TasksExercices();
        TasksExercices tasksExercices2 = new TasksExercices();
        tasksExercices1.perimeters();
        System.out.println("x=" + tasksExercices1.x);
        System.out.println("y=" + tasksExercices2.y);
        System.out.println(tasksExercices1);
        tasksExercices1.x = 22;
        tasksExercices2.y = 3;
        System.out.println("x1=" + tasksExercices1.x);
        System.out.println("x2=" + tasksExercices2.x);
        System.out.println("y1=" + tasksExercices1.y);
        System.out.println("y2=" + tasksExercices2.y);

        //Task1
        tasksExercices1.perimeters();
        TasksExercices.printAllPrimeNumbers();
        TasksExercices.longestWord();
    }
}
