package com.company;

public class SolutionNumbersWithEven {
    public int findNumbers(int[] nums) {
        int evensnumber = 0;

        for (int i = 0; i<nums.length; i++) {
            if  ((int) (Math.log10(nums[i]) + 1) % 2 == 0) {
                evensnumber ++;
            }
        }

        return evensnumber;
    }
}
