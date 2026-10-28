package Recursion.Strings;
public class RemoveCharacter{
    public static String removeChar(String str,int index,char c){
        if(index==str.length()){
            return "";
        }
        String small=removeChar(str,index+1,c);
        if(str.charAt(index)==c){
            return small;
        }
        else{
            return str.charAt(index)+small;
        }
    }
    public static void main(String[] args){
        System.out.println(removeChar("punarv",0,'p'));
    }
}

