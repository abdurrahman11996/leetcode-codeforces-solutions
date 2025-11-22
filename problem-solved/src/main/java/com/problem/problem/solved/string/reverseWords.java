package com.problem.problem.solved.string;

public class reverseWords {
    public static void main(String [] args){
        String s = "a good example";
        String st[]=s.split(" ");
        StringBuilder tem=new StringBuilder();
        for (int i= st.length-1;i>=0;i--){
            //tem=tem+st[i]+" ";
            tem.append(st[i]);
            tem.append(" ");
        }
        s = tem.toString().trim();
        System.out.println(s);
    }
}
