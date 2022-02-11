package com.company;

public class Solution {
    public int findMaxConsecutiveOnes2(int[] nums) {
        int numOfOnes = 0;
        int BiggestnumOfOnes = 0;
            for (int i = 0; i < nums.length; i++) {
                //System.out.println("New external loop iteration");
                if (nums[i] == 1) {
                    numOfOnes += 1;

                    for (int j = i+1; j < nums.length; j++) {
                        if (nums[j] == 1) {
                            numOfOnes += 1;
                            //System.out.println (numOfOnes);
                        } else {
                            break;
                        }
                    }
                }
                if (numOfOnes > BiggestnumOfOnes) {
                    BiggestnumOfOnes = numOfOnes;
                }
                numOfOnes = 0;
            }
            return BiggestnumOfOnes;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int numOfOnes = 0;
        int BiggestnumOfOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numOfOnes += 1;
            }
            else {
                BiggestnumOfOnes = Math.max(BiggestnumOfOnes, numOfOnes);
                numOfOnes = 0;
            }
        }
        return Math.max(BiggestnumOfOnes,numOfOnes);
    }

}
