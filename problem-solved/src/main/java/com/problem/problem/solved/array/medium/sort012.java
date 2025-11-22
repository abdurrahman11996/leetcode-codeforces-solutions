package com.problem.problem.solved.array.medium;

public class sort012 {
    public static void main(String[] agrs){
        int arr[]={1,2,0,1,2,0};
        int one=0,zero=0,two=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0)zero++;
            else if (arr[i]==1)one++;
            else two++;
        }
        for (int i=0;i<zero;i++)arr[i]=0;
        for (int i=zero;i<zero+one;i++)arr[i]=1;
        for (int i=zero+one;i< arr.length;i++)arr[i]=2;
        for (int i=0;i< arr.length;i++) System.out.print(arr[i]+" ");
    }
}
