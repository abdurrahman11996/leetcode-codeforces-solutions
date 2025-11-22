package com.problem.problem.solved.string;

public class validPlaindrom {
    public static void main(String[] args){
        String s= "madam madam";
       String tm= "";
       for (int i=s.length()-1;i>=0;i--){
           tm=tm + s.charAt(i);
       }
       if(s.equalsIgnoreCase(tm)) System.out.println("valid");else System.out.println("not valid");

    }
}
