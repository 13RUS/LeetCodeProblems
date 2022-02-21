package com.company;

public class SolutionRemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 0;
        int n = nums.length;
        int val = nums[0];

        while (j < n){
            if (nums[j] == val) {
                    j++;
                } else {
                k++;
                nums[k++] = nums[j];
                val = nums[j];
                j++;
            }
        };

        return k+1;
    }
}
