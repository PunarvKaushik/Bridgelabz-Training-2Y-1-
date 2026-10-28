package Recursion.Arrays;

public class GreatestCommonDivisor {
    public static int gcd(int x,int y){
        if(x%y==0){
            return x/y;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args){
        System.out.println(gcd(12,16));
    }
}
