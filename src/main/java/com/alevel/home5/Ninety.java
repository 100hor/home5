package com.alevel.home5;

public class Ninety {
     public int[][] matrix(int n){

        int [][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            mat[i][i] = i + 1;
        }
        int j = n-1;
        for (int i = 0; i < n; i++) {
            mat[i][j] = n - i;
            j--;
        }

        return mat;
    }


}
