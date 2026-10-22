package Recursion;

public class Fibonacci {
    public static int fibonacciSeries(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int small1=fibonacciSeries(n-1);
        int small2=fibonacciSeries(n-2);
        return small1+small2;
    }
    public static void main(String[] args){
        System.out.println(fibonacciSeries(7));
    }
}
