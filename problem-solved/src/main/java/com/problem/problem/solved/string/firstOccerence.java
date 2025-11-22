package com.problem.problem.solved.string;

public class firstOccerence {
    public static void main(String[] args){
        String hy="sabsadut";
        String nd="sad";
        for(int i=0;i<hy.length();i++){
            if(hy.charAt(i)==nd.charAt(0)){
                if(hy.substring(i,nd.length()+i).equalsIgnoreCase(nd)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
