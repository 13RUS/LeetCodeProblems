package com.company;

public class SolutionDublicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i=0; i<arr.length; i++) {

            if (arr[i] == 0) {
                if (i == arr.length-1) {break;}
                for (int j=arr.length-1; j > i+1; j--){
                    arr[j] = arr [j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
