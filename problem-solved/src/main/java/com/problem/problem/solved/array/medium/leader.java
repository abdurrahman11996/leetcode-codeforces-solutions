package com.problem.problem.solved.array.medium;

import java.util.ArrayList;
import java.util.List;

public class leader {
    public static void main(String[] args) {
        int arr[]={4,7,1,0};
        int mx= arr[arr.length-1];
        List<Integer>list=new ArrayList<>();
        for(int i= arr.length-2;i>=0;i--){
            if(mx<arr[i]){
                list.add(arr[i]);
                mx=arr[i];
            }
        }
        list.forEach(x-> System.out.print(x+" "));

    }
}
