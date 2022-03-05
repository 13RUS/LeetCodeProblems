package com.company;

import java.util.Arrays;

public class SolutionThirdMax {
    public int thirdMax(int[] nums) {

        int newLength = nums.length;
        int[] copiedArray = Arrays.copyOf(nums, newLength);
        Arrays.sort(copiedArray);
        int copiedArrayLength = 1;
        nums[0] = copiedArray[0];

        for (int i = 1; i  < nums.length; i++) {
             if (copiedArray[i] != copiedArray[i-1]){
                 nums[copiedArrayLength] = copiedArray[i];
                 copiedArrayLength++;
             }
        }

        for (int i = 0; i  < copiedArrayLength; i++) {
            System.out.print(" " + nums[i]);
        }

        System.out.print("\ncoppiedArrayLength = " + copiedArrayLength);
        System.out.println();
        if (copiedArrayLength < 3) return nums[copiedArrayLength-1];

        return nums[copiedArrayLength-3];
    }
}
