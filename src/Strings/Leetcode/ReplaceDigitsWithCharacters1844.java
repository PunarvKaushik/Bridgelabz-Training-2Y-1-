package Strings.Leetcode;

    class Solution {
        public String replaceDigits(String s) {
            StringBuilder ans=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>='a' && ch<='z'){
                    ans.append(ch);
                }
                else{
                    ans.append((char)(s.charAt(i-1)+(ch-48)));
                }
            }
            return ans.toString();
        }
    }
