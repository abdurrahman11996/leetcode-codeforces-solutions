package com.problem.problem.solved.array;

public class leftRotted {
    public static void main(String[] agrs){
        int arr[]={1,2,3,4,5};
        int i=0;
        int n=arr[0];
        for (int j=1;j<arr.length;j++){
            arr[i++]=arr[j];
        }
        arr[i++]=n;
        for(int j=0;j<arr.length;j++) System.out.print(arr[j]+" ");
    }
}
