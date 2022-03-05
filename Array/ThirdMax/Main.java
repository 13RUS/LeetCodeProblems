package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = {1,1,0,1,1,1};
        
        nums = new int [] {3,2,2,2,1,3,4,5,6,6};
        nums = new int [] {3,2,1,1};
        nums = new int [] {-1,1,-2};
        SolutionThirdMax solutionThirdMax = new SolutionThirdMax();
        System.out.println(solutionThirdMax.thirdMax(nums));
    }
}
