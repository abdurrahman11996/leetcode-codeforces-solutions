package com.problem.problem.solved.array;

import java.util.Arrays;

public class peekElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 7, 9, 8};
        int tm;
       int mini=arr[0];
       for (int i=1;i< arr.length;i++){
           if(arr[i]<mini)mini=arr[i];
       }
       int S_mi=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]<S_mi && arr[i]!=mini)
               S_mi=arr[i];
       }
        System.out.println(S_mi);
    }
}
