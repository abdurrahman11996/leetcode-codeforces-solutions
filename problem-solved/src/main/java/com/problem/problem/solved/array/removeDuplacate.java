package com.problem.problem.solved.array;

import java.util.HashSet;

public class removeDuplacate {
    public static void main(String[] agrs){
        int arr[]={1,1,1,2,2,3,3,3,4,4};

        int i=0;
        for (int j=1;j<arr.length;j++){
            if(arr[j]!=arr[j-1])arr[++i]=arr[j];
        }
        for(int j=0;j<i;j++) System.out.print(arr[j]+" ");


    }
}
