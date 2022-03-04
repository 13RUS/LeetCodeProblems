package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {1,1,0,1,1,1};
       
        SolutionMaxConsecutiveOnes2 solutionMaxConsecutiveOnes2 = new SolutionMaxConsecutiveOnes2();
        nums = new int [] {1,0,1,1,0};
        //nums = new int [] {1,0,1,1,0,1};
        //nums = new int [] {1,1,1,1,1,0};
        //nums = new int [] {1,0,0,0};
        System.out.println(solutionMaxConsecutiveOnes2.findMaxConsecutiveOnes(nums));

    }
}
