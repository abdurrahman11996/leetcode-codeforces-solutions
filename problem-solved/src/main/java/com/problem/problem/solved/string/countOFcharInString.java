package com.problem.problem.solved.string;

public class countOFcharInString {
    public static void main(String[] args){
        String s= " hello world";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')continue;
            else cnt++;
        }
        System.out.println(cnt);
    }
}
