package com.problem.problem.solved.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mejroityElement {
    public static void main(String[] agrs){
        int arr[]={2,2,3,3,1,2,2};
        int target= arr.length/2;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
               int valu= map.get(arr[i]);
               map.put(arr[i],valu+1);
            }else map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>=target){
                System.out.print(it.getKey()+" ");
            }
        }


    }
}
