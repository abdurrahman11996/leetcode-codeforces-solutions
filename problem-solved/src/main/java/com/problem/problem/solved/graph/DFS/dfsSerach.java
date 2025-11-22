package com.problem.problem.solved.graph.DFS;

import java.util.ArrayList;

public class dfsSerach {
    public static void dfs(int node, boolean[] vis,ArrayList<ArrayList<Integer>>adjlist,ArrayList<Integer>ls){
        vis[node]=true;
        ls.add(node);
        for(Integer child : adjlist.get(node)){
            if(vis[child]==false)dfs(child,vis,adjlist,ls);
        }
    }

    public ArrayList<Integer> dfstravers(int n, ArrayList<ArrayList<Integer>>adjlist){
        boolean vis[] = new boolean[n+1];
        ArrayList<Integer>ls=new ArrayList<>();
        int cnt=0;
        for(int c=1;c<=n;c++){
            if(vis[c]==false){
                cnt++;
                dfs(c,vis,adjlist,ls);
            }
        }
        System.out.println(cnt);
        return ls;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for (int i=0;i<9;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(6);
        adj.get(6).add(5);
        adj.get(7).add(8);
        adj.get(8).add(7);
        dfsSerach obj = new dfsSerach();
        ArrayList<Integer> list = obj.dfstravers(8 ,adj);

        for (Integer x:list){
            System.out.print(x+" ");
        }
    }
}
