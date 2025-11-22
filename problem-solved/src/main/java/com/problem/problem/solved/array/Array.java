package com.problem.problem.solved.array;

public class Array {
    public static void main(String[] args){
        System.out.println("masum shahriar");
        int arr[]={3,2,5,6,2};
        int tm;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    tm=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tm;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
