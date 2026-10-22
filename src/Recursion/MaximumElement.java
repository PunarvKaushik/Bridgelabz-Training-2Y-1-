package Recursion;

public class MaximumElement {
    public static int maxElement(int[] a,int index){
        if(index==a.length-1) {
            return a[index];
        }
        int check=a[index];
        int small=maxElement(a,index+1);
        return Math.max(small,check);
    }
    public static void main(String[] args){
        int[] a={1,23,2000,45,1763,6,7,99,5,4};
        System.out.println(maxElement(a,0));
    }
}
