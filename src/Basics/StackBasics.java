package Basics;

import java.util.*;
public class StackBasics {
    public static void main(){
        Stack<Integer> a1=new Stack<>();
        a1.push(10);
        a1.push(20);
        a1.push(30);
        a1.push(40);
        a1.push(50);
        System.out.println("Original Stack :"+a1);
        a1.pop();
        a1.pop();
        System.out.println("Stack after pop method :"+a1);
        a1.push(40);
        a1.push(50);
        System.out.println("Original Stack :"+a1);
        System.out.println("Peek :"+a1.peek());
        System.out.println("Stack :"+a1);
    }
}
