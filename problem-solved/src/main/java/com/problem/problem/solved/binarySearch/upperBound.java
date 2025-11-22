package com.problem.problem.solved.binarySearch;

public class upperBound {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,4,4,5,5,6,67};
        int l=0,r=arr.length-1;
        int res =-1;
        int tar=4;
        while (l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==tar){
                res=mid;
                l=mid+1;
            }
            else if (arr[mid]<tar){
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println(res);
    }
}
