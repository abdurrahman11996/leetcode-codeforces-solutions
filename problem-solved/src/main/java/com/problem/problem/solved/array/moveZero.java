package com.problem.problem.solved.array;

public class moveZero {
    public static void main(String[] agrs){
        int arr[]={1,0,2,3,4,0,1};
        int i=0;
        for(int j=0;j< arr.length;j++){
            if(arr[j]!=0) arr[i++]=arr[j];
        }
        for(int j=i;j< arr.length;j++)arr[j]=0;
        for (int j=0;j< arr.length;j++) System.out.print(arr[j]+" ");
    }
}
