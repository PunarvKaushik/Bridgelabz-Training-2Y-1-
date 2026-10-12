package Recursion;

public class Sum {
    public static int sumNumbers(int n){
        if(n==1){
            return 1;
        }
        int sum=sumNumbers(n-1);
        return sum+n;
    }
    public static void main(String[] args){
        System.out.println(sumNumbers(15));
    }
}
