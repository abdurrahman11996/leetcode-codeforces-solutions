package com.problem.problem.solved.string;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class lengthofString {
    public static void main(String[] args){
        String st="abdur rahman";
        System.out.println(st.length());
        char str[]=st.toCharArray();
        int cnt=0;
       for(char x:str){
           cnt++;
       }
        System.out.println(cnt);
    }

}
