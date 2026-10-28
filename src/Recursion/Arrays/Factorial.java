package Recursion.Arrays;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int f=fact(n-1);
        return n*f;
    }

    public static void main() {
        System.out.println(fact(10));
    }
}
