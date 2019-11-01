package com.alevel.home5;

public class FiftySeven {
    public int[] killTheSame(int arr[]) {
        int col = 0;
        int tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - col; j++) {
                if (arr[i] == arr[j]) {
                    if (arr[arr.length - 1 - col] == arr[j] && j != arr.length - 1 - col) {
                        col++;
                    }
                    tmp = arr[arr.length - 1 - col];
                    arr[arr.length - 1 - col] = arr[j];
                    arr[j] = tmp;
                    col++;
                }
            }

        }
        int[] result = new int[arr.length - col];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }


}
