package com.company;

public class SolutionMoveZeroes {
    public void moveZeroes(int[] nums) {

    int j = nums.length-1;
    int i = 0, k = 0;


     while (i != nums.length-1 || j !=0) {
       if (i == j ) break;
       if (nums[i] == 0) {
           k = i;

           while ( k < j ) {
               nums[k] = nums[k+1];
               k++;
           }
           nums[j] = 0;
           j--;
       } else {
           i++;
       }
     }


    for (i = 0; i < nums.length; i++) {
        System.out.print(" " + nums[i]);
    }

    }
}
