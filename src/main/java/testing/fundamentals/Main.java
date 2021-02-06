package testing.fundamentals;

public class Main {
    public static void main(String[] args) {
        ArrayStringsExercice arrayEx = new ArrayStringsExercice();
        String text = "Ala bala portocala";
        String text2 = arrayEx.changeSpaceInString(text);
        System.out.println(text2);
    }
}
