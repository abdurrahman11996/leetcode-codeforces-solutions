package com.problem.problem.solved.array;

public class missingNumber {
    public static void main(String[] args){
       int arr[]={1,2,4,5,6};
       int n=arr.length;
       int sum2=0;
       int sum = (n*(n+1))/2;
        System.out.println(sum);
       for (int i=0;i<n;i++){
           sum2=sum2+arr[i];
       }
        System.out.println(sum2);
        System.out.println(sum-sum2);

    }

}
