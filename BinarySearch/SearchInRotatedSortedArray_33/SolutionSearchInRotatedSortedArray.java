package com.company;

import java.util.Arrays;

public class SolutionSearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        int numssorted [] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numssorted);

        int k = 0;

        if (! Arrays.equals(nums, numssorted)) {

            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums.length == 1) break;
                if (nums[i] < nums[i - 1]) {
                    k++;
                    break;
                }
                k++;
            }

        }
        System.out.println("k = "+k);

        int middle=0, left=0, position = 0, right = nums.length-1;
        boolean founded = false;

        while (left <= right) {
            middle = left + (right-left) / 2;
            if (numssorted[middle] == target) {founded = true; position=middle; break;}
            if (numssorted[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (!founded) return -1;

        //System.out.println("k = "+position%k);
        return (position+ nums.length-k)% nums.length;
    }
}
