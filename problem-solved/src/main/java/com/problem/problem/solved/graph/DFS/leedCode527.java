package com.problem.problem.solved.graph.DFS;

import java.util.ArrayList;

public class leedCode527 {
    public static void dfs(int node,int [] vis,ArrayList<ArrayList<Integer>>adj){
        vis[node]=1;
        for(Integer child : adj.get(node)){
            if(vis[child]==0)dfs(child,vis,adj);
        }
    }
    public int numberofprovicen(ArrayList<ArrayList<Integer>>adj,int v){
        int cnt=0;
        int vis[]=new int[100];
        for (int i=0;i<v;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,vis,adj);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,0},{1,1,0},{0,0,1}};
        //System.out.println(arr[0].length);
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<arr[0].length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        leedCode527 obj = new leedCode527();
       int res=obj.numberofprovicen(adj, arr[0].length);
        System.out.println(res);
    }
}
