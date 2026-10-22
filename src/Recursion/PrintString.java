package Recursion;

public class PrintString {
    public static void printCharacter(String name,int index){
        if(index==name.length()){
            return;
        }
        System.out.print(name.charAt(index)+"/");
        printCharacter(name,index+1);
    }
    public static void printReverseCharacter(String name,int index){
        if(index==name.length()){
            return;
        }
        printReverseCharacter(name,index+1);
        System.out.print(name.charAt(index)+"/");
    }

    public static void main(String[] args){
        printCharacter("Punarv Kaushik",0);
        System.out.println();
        printReverseCharacter("Punarv Kaushik",0);
    }
}
