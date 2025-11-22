package com.problem.problem.solved.array.sort;

public class BubolSort {
    public static void main(String[] args){
        int arr[] ={4,2,6,1,7,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int tm = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= tm;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
