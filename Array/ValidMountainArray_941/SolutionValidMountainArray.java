package com.company;

public class SolutionValidMountainArray {
    public boolean validMountainArray(int[] arr) {

        int j = 1;

        if (arr.length < 3) return false;
        while (arr[j] > arr[j - 1] && j < arr.length-1) {j++;}

        if (j==1) return false;

        for (int i = arr.length-1; i >= j; i--) {
            if (arr[i] >= arr[i-1]) return false;
        }
        return true;
    }

    public boolean validMountainArray2(int[] arr) {
        int N = arr.length;
        int j = 0;

        while (arr[j] < arr[j+1] && j < N-1)
            j++;

        if (j == 1 || j == N-1)
            return false;

        while (arr[j] > arr[j+1] && j+1 < N)
            j++;

        return j == N-1;
    }


}
