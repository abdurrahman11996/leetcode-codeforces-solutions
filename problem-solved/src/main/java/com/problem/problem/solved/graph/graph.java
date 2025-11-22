package com.problem.problem.solved.graph;

import com.problem.problem.solved.graph.DFS.dfsSerach;

import java.util.ArrayList;

public class graph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        for (int i = 0; i < 5; i++) {
            System.out.print(i + "-> ");
            for (int x : adj.get(i)) {
                System.out.print(x + ",");
            }
            System.out.println();
        }
    }
}
