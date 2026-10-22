package Recursion;

public class LinearSearch {
    public static int linearSeach(int[] a,int index,int target){
        if(index==a.length-1){
            return -1;
        }
        if(a[index]==target){
            return index;
        }
        return linearSeach(a,index+1,target);
    }
    public static void main(String[] args){
        int[] a={1,4,7,34,66,67,69};
        System.out.println(linearSeach(a,0,67));
    }
}
