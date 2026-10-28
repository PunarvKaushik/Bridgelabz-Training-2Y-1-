package Recursion.Arrays;

public class SumOfArray {
    public static int sum(int[] a,int index){
        if(index==a.length){
            return 0;
        }
        int add=sum(a,index+1);
        return add+a[index];
    }
    public static void main(String[] args){
        int[] a={1,22,3,4,5,6,7,77,8,88,99,100};
        System.out.println(sum(a,0));
    }
}
