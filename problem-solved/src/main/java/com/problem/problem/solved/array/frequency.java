package com.problem.problem.solved.array;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,52,1,1,2,3,4,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
           else map.put(arr[i],1);
        }

        System.out.println(map);
    }

}
