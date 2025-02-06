public class exerciseThree {
    public static void scopeExercise(int a, int b) {
        int x = 5;
        if (a > b) {
            int y = 10;
            System.out.println(x); // Is this valid?
        }
        System.out.println(y); // Will this compile?
    }
}

exerciseThree exercise;

