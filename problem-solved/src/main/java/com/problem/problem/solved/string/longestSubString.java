package com.problem.problem.solved.string;

import java.util.HashSet;

public class longestSubString {
    public static void main(String[] args){
        String s = "pwwekw";
        String st="";
        HashSet<Character>set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
        for( char x : set){
            st=st+x;
        }
        System.out.println(st);
        System.out.println(st.length());
    }
}
