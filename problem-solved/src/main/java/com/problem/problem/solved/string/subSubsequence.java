package com.problem.problem.solved.string;

public class subSubsequence {
    public static void main(String[] agrs) {
        String t = "ahbage";
        String s = "age";
        int i = 0;
        for (int j = 0; j < t.length(); ) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else j++;
        }
        if(i==s.length()) System.out.println("true");else System.out.println("false");

    }
}