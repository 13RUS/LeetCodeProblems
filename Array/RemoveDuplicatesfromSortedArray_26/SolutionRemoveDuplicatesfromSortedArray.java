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

    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;

        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

}
