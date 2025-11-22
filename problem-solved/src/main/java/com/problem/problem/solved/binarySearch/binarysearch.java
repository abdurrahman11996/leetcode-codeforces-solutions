package com.problem.problem.solved.binarySearch;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
        int targ = 7;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == targ) {
                System.out.println(arr[mid]+" "+mid);
                break;
            }
            if (arr[mid] < targ) {
                low = mid + 1;
            } else high = mid - 1;
        }
    }
}
