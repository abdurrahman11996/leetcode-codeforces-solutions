package com.problem.problem.solved.array.medium;

import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,2,3,4,6};
        int target=6;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int l=i+1,r=arr.length-1;
            while (l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==target){
                    System.out.print(arr[i]+" "+arr[l]+" "+arr[r]);
                    return;
                } else if (sum>target) {
                    r--;
                }else l++;
            }
        }
    }
}
