package com.problem.problem.solved.array;

import java.util.Arrays;

public class margeArray {
    public static void main(String[] args) {
        // int [] num1= new int[100];
        int num1[] = {2, 6, 3, 5};
        int num2[] = {2, 4, 1, 8, 7};
        int num3[] = new int[100];
        int n = num1.length;
        int m = num2.length;
        for (int i = 0,j=0; i < n + m; i++) {
            if (i < n) {
                num3[i] = num1[i];
            } else{
                num3[i] = num2[j];
                j++;
            }
        }
        //Arrays.sort(num3);
        for (int i = 0; i < n + m; i++) {
            System.out.print(num3[i] + " ");
        }

    }

}
