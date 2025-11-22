package com.problem.problem.solved.graph.BFS.numberOFIsland;

import java.util.LinkedList;
import java.util.Queue;

public class NumberofInland {
    public static void bfs(int row, int col, int[][] vis,
                           int[][] arr, int n, int m) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));
        vis[row][col] = 1;
        while (!q.isEmpty()) {
            int row1 = q.peek().first;
            int col1 = q.peek().second;
            q.remove();
            for (int delrow = -1; delrow <= 1; delrow++) {
                for (int delcol = -1; delcol <= 1; delcol++) {
                    int nrow = row1 + delrow;
                    int ncol = col1 + delcol;
                    if (vis[nrow][ncol] == 0 && arr[nrow][col] == 1
                            && nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};

        int n = arr.length;
        int m = arr[0].length;
        int vis[][] = new int[n][m];
        int cnt = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (arr[row][col] == 1 && vis[row][col] == 0) {
                    cnt++;
                    bfs(row, col, vis, arr, n, m);
                }
            }
        }
        System.out.println(cnt);
    }
}
