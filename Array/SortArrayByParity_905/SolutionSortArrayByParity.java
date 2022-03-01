package com.company;

public class SolutionSortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {

        int lastEvenFoundAt = 0, movedelement = 0;

        for (int i=0; i < nums.length; i++){
            if (nums[i] % 2 == 0) {
                movedelement = nums[lastEvenFoundAt];
                nums[lastEvenFoundAt++] = nums[i];
                nums[i] = movedelement;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }

        return nums;
    }
}
