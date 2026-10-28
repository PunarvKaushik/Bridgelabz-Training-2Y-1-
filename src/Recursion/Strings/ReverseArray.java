package Recursion.Strings;

public class ReverseArray {
    public static void rev(int[] a,int index){
        if(index==a.length){
            return;
        }
        rev(a,index+1);
        System.out.print(a[index]+" ");
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        rev(a,0);
    }
}
