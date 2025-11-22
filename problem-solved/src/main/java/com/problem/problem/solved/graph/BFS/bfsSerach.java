package com.problem.problem.solved.graph.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsSerach {
    public static ArrayList<Integer> bfs( int n,ArrayList<ArrayList<Integer>>adj,int [] vis){
        ArrayList<Integer>ls=new ArrayList<>();
        Queue<Integer>q =new LinkedList<>();
        q.add(n);
        vis[n]=1;
        while (!q.isEmpty()){
            int font = q.peek();
            ls.add(font);
            q.poll();
            for (int child : adj.get(font)){
                if(vis[child]==0){
                    vis[child]=1;
                    q.add(child);
                }
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for (int i=0;i<9;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(4);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(6);
        adj.get(6).add(3);
        adj.get(3).add(7);
        adj.get(7).add(3);

        int vis[] = new int[8];
        ArrayList<Integer> res =  bfs(1,adj,vis);
        for (int x : res){
            System.out.print(x+" ");
        }
    }
}
