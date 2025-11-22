package com.problem.problem.solved.binarySearch;

public class celiElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,9,10,11};
        int tar=5;
        int res=-1;
        int l=0,r= arr.length-1;
        while (l<=r){
            int mid =(l+r)/2;
            if(arr[mid]==tar) {
                res=mid;
                return;
            }
            else if (arr[mid]<tar){
                l=mid+1;
                res=arr[mid];

            }
            else {
                r=mid-1;

            }
        }
        System.out.println(res);
    }
}
