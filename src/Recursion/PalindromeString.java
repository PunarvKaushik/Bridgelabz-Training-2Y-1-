package Recursion.Arrays;

public class PalindromeString {
    public static boolean palindromeString(String str,int start,int end){
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        if(start>=end){
            return true;
        }
        return palindromeString(str,start+1,end-1);
    }
    public static void main(String[] args){
        String s="tattarrattat";
        System.out.println(palindromeString(s,0,s.length()-1));
    }
}
