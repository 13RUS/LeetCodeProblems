package com.company;

public class Main {

    public static void main(String[] args) {

        int [] nums = {1,1,0,1,1,1};
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes (nums));

        nums = new int [] {1,0,1,1,0,1};
        System.out.println(solution.findMaxConsecutiveOnes (nums));
    }
}
