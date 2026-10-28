package Recursion.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] a,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(start-end)/2;
        if(a[mid]==target){
            return mid;
        }
        if(target<a[mid]){
            return binarySearch(a,start,mid-1,target);
        }
        return binarySearch(a,mid,end,target);
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        System.out.println(binarySearch(arr,0,arr.length-1,20));
    }
}
