package Recursion.AdvancedRecursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSequence {
    public static ArrayList<String> findSubSequence(String s){
        ArrayList<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char ch=s.charAt(0);
        ArrayList<String> smallans=findSubSequence(s.substring(1));
        for(String ss : smallans){
            ans.add(ss);
            ans.add(ch+ss);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        System.out.println(findSubSequence("Punarv"));
    }
}
