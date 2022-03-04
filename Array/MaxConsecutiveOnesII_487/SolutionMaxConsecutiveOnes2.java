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

                System.out.println(i);

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
}
