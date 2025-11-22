package com.problem.problem.solved.hashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] agrs){
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(1,2);
        map.put(1,3);
        map.put(null,4);
        map.put(null,5);
        System.out.println(map);
    }
}
