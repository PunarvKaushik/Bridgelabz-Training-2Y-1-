package Recursion.AdvancedRecursion;

public class TowerOfHanoi {
    public static void toh(int n,char source,char helper,char destination){
        if(n==1){
            System.out.println("Move Disk "+1+" from "+source+" to "+destination);
            return;
        }
        toh(n-1,source,destination,helper);
        System.out.println("Move Disk "+n+" from "+source+" to "+destination);
        toh(n-1,helper,source,destination);
    }
    public static void main(String[] args){
        int n=5;
        toh(n,'A','B','C');
    }
}
