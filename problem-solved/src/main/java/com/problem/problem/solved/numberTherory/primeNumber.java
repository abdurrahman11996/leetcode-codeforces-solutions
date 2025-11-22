package com.problem.problem.solved.numberTherory;

import java.util.ArrayList;
import java.util.List;

public class primeNumber {
    public static boolean prime(int n) {
        if (n <=1) return false ;
        if(n==2 || n==3)return true;
        //if (n <= 3) return true;
        if (n % 2 == 0) return false;

       for(int i=3;i*i<=n;i++){
           if(n%i==0)return false;
        }
       return true;
    }

    public static void main(String[] args) {
        int cnt=0;
        List<Integer>list=new ArrayList<>();
        for (int i=1;i<100;i++){
            if(prime(i)){
                cnt++;
                list.add(i);
            }
        }
        System.out.println(cnt);
        System.out.println(list);
        
    }
}
