package com.problem.problem.solved.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public static void main(String[] agrs){
        String st[] ={"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>>map=new HashMap<>();
        for(int i=0;i<st.length;i++){
            char [] s = st[i].toCharArray();
            Arrays.sort(s);
            String sortString= String.valueOf(s);
            if(!map.containsKey(sortString)){
                map.put(sortString, new ArrayList<>());
            } map.get(sortString).add(st[i]);
        }
        System.out.println(map);
    }
}
