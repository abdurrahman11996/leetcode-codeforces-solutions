package com.problem.problem.solved.array.medium;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] agrs){
        int arr[]={3,2,1,6,7,4};
        int target=8;
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while (l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                System.out.println(arr[l]+" "+arr[r]);return;
            } else if (sum>target) {
                r--;
            } else if (sum<target) {
                l++;
            }
        }

    }
}
