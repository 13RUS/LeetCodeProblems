package com.company;

public class SolutionIfNandDoubleExist {
    public boolean checkIfExist(int[] arr) {

        int [] squarenums = new int [arr.length];

        for (int i=0; i<arr.length; i++){
            squarenums[i] = arr[i]*2;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[j] == squarenums[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}
