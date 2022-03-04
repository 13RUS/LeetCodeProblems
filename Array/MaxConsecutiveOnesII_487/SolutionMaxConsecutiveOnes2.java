package com.company;

public class SolutionMaxConsecutiveOnes2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int num = 0, globalNum = 0;
        int i = 0;

        for (int currentPoint = 0; currentPoint < nums.length; currentPoint++) {
            if (nums[currentPoint] == 0){
                i = currentPoint;
                nums[currentPoint] = 1;

                for (int j=i; j >= 0; j--) {
                    if (nums[j] == 0) {break;}
                    i = j;
                }

                for (; i < nums.length; i++) {
                    if (nums[i] == 0) {break;}
                    num++;
                }
                nums[currentPoint] = 0;
            }
            if (num > globalNum) {globalNum = num;}
            num = 0;

        }
        if (globalNum == 0) {globalNum=nums.length;};

        return globalNum;
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        int globalNum = 0;
        int left = 0, right = 0;
        int numZeroes = 0;

        while (right < nums.length){
            if (nums[right] == 0){
                numZeroes++;
            }

            while (numZeroes == 2){
                if (nums[left] == 0){
                    numZeroes--;
                }
                left++;
            }


            globalNum = Math.max(globalNum, right-left+1);
            right++;
        }

        return globalNum;
    }
}
