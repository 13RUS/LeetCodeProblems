package com.company;

public class SolutionRemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0, pe = nums.length - 1, b = 0;
        if (pe < 0) return k;

        while (k != pe + 1) {

            if (nums[k] == val) {
                while (pe > k && nums[pe] == val) {
                    pe--;
                }
                if (pe == 0 || pe == k) break;
                b = nums[k];
                nums[k] = nums[pe];
                nums[pe] = b;
                pe--;
                k++;
            } else k++;

        }
        if (pe == nums.length - 1) {
            nums = new int[]{};
        }
        return k;

    }

    public int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
