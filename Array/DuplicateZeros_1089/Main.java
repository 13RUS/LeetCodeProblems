package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DVD[] dvdCollection = new DVD[15];
        System.out.println("O'la");

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");

        dvdCollection[7] = avengersDVD;
        // Put "The Incredibles" into the 4th place: index 3.
        dvdCollection[3] = incrediblesDVD;
        // Put "Finding Dory" into the 10th place: index 9.
        dvdCollection[9] = findingDoryDVD;
        // Put "The Lion King" into the 3rd place: index 2.
        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = starWarsDVD;

        int [] nums = {1,1,0,1,1,1};
        Solution solution = new Solution();
        System.out.println(solution.findMaxConsecutiveOnes (nums));

        nums = new int [] {1,0,1,1,0,1};
        System.out.println(solution.findMaxConsecutiveOnes (nums));

        SolutionTwoSum solutionTwoSum = new SolutionTwoSum();
        nums = new int [] {4,-2,5,0,6,3,2};

        SolutionDublicateZeros solutionDublicateZeros = new SolutionDublicateZeros();
        nums = new int [] {1,0,2,3,0,4,5,0};
        nums = new int [] {1,2,3};
        nums = new int [] {0,0,0,0,0,0,0};

        solutionDublicateZeros.duplicateZeros(nums);

    }
}
